
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Write a description of class HuffmanCode here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public class HuffmanCode {

    /**
     * codeMap The Huffman code map created from the seed.
     */
    private HashMap<Character, String> codeMap;
    /**
     * codeTree Root of the Huffman code tree created from the seed
     */
    private HNode codeTree;
    /**
     * seed The seed string used to create the Huffman code.
     */
    private String seed;

    /**
     * HuffmanCode
     *
     * Establish this Huffman code based on an initial string.
     *
     * @param initialString - the initial string used to create the code
     *
     */
    public HuffmanCode(String initialString) {
        seed = initialString;
        codeTree = null;
        codeMap = null;
    }

    /**
     * createFrequencyMap Create a map of character -> frequency based on a
     * string.
     *
     * @param source - the string of characters
     *
     */
     private HashMap<Character, Integer> createFrequencyMap(String source) {
        HashMap<  Character, Integer> map = null;
        Character letter = null;
        int num = 0;
        for (int i = 0; i < source.toCharArray().length; i++) {
            letter = new Character(source.charAt(i));
            if (map == null) {
                map = new HashMap();

            }
            if (map.containsKey(letter)) {
                num = map.get(letter).intValue();
                map.remove(letter);
                num++;
                map.put(letter, num);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }//end createFrequencyMap


    /**
     * createPriorityQueue Create a Priority Queue using data from a frequency
     * map.
     *
     * @param fm - the frequency map
     * @return a priority queue with values from the frequency map
     */
     private PriorityQueue<HNode> createPriorityQueue(HashMap<Character, Integer> fm) {

        PriorityQueue<HNode> pq = new PriorityQueue<HNode>();
        int j = 0;
        HNode node = null;

        for (Entry<Character, Integer> entry : fm.entrySet()) {
            node = new HNode(entry.getKey(), entry.getValue());
            pq.add(node);
            j++;
        }
        pq.comparator();
        return pq;
    }// end createPriorityQueue


    /**
     * createCodeTree Establish the codeTree using the PriorityQueue provided.
     *
     * @param hh - the priority queue with data for the Huffman Code
     */
    private void createCodeTree(PriorityQueue<HNode> hh) {
        HNode aNode, bNode, set0Node, set1node;
        HNode cNode = null;
        PriorityQueue<HNode> pq = hh;
        while (pq.size() > 1) {
            aNode = pq.remove();
            bNode = pq.remove();
            int numA = aNode.compareTo(bNode);
            int numB = bNode.compareTo(aNode);

            double numFequA = aNode.getFrequency();
            double numFequB = bNode.getFrequency();
            double numFequ = numFequA + numFequB;

            if (numFequA < numFequB) {


                setCodes(aNode, "1");
                setCodes(bNode, "0");
                set1node = aNode;
                set0Node = bNode;
            } else {

                setCodes(aNode, "0");
                setCodes(bNode, "1");
                set1node = bNode;
                set0Node = aNode;
            }

            cNode = new HNode(null, numFequ, "0", set1node, set0Node);
            pq.add(cNode);
        }
        codeTree = cNode;

    }// end createCodeTree


    /**
     * decode Decode a string using this Huffman code.
     *
     * @param encoded - the string to decode
     * @return the decoded string
     *
     */
     public String decode(String encoded) {
        StringBuilder codeString = new StringBuilder('0');
        StringBuilder result = new StringBuilder('0');
        int i = 0;

        HNode root = codeTree;

        while (i < encoded.length()) {
            codeString.append(encoded.charAt(i));
           
            if (root.getSymbol() != null) {
                result.append(root.getSymbol());
                root = codeTree;
                codeString = new StringBuilder('0');
                i++;
               
            }else{
            
            i++;
                if (encoded.charAt(i) == '0') {
                    root = root.getRightChild();
                } else {
                    root = root.getLeftChild();
                }
            }
        }
        return result.toString();

    }// end decode

   

    /**
     * encode Encode a string using this Huffman code.
     *
     * @param cleartext - the string to encode
     * @return the encoded string
     */
     public String encode(String cleartext) {
        String codeString = null;
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < cleartext.length(); i++) {
            if (codeMap.containsKey(cleartext.charAt(i))) {
                codeString = codeMap.get(cleartext.charAt(i));
                result.append(codeString);
            }
        }
        return result.toString();
    }// end encode


    /**
     * getCodeMap Retrieve the internal Huffman Code Map.
     *
     * @return the code map for this Huffman Code
     */
    public HashMap<Character, String> getCodeMap() {
             growCodeMap(codeTree);
        return codeMap;
    }

    /**
     * getCodeTree Retrieve the internal Huffman Code Tree.
     *
     * @return the root of the code tree for this Huffman Code
     */
    public HNode getCodeTree() {
        createCodeTree(createPriorityQueue(createFrequencyMap(seed)));

        return codeTree;
        
    }// end getCodeTree
    /**
     * growCodeMap Create codeMap from a code tree.
     *
     * @param root - the root of a Huffman Code subtree
     */
    private HashMap<Character, String> map = null;

    private void growCodeMap(HNode root) {
        int j = 0;
        String codeString = null, codeStringLeft = null, codeStringRight = null;

        if (root == null) {
            System.out.println("codeTree null");
            System.exit(j);
        }

        if (map == null) {
            map = new HashMap<Character, String>();
            map.put(null, "0");

        }


        map.put(root.getSymbol(), root.getCode());
        codeString = root.getCode();
        if (root.getLeftChild() != null) {
            codeStringLeft = codeString + root.getLeftChild().getCode();
            root.getLeftChild().setCode(codeStringLeft);
            growCodeMap(root.getLeftChild());
        }

        if (root.getRightChild() != null) {
            codeStringRight = codeString + root.getRightChild().getCode();
            root.getRightChild().setCode(codeStringRight);
            growCodeMap(root.getRightChild());
        }

        codeMap = map;
    }// end growCodeMap


    /**
     * setCodes Fill in the Huffman Codes in a tree.
     *
     * @param root - the root of the Huffman Code subtree code - the code to set
     * at the root
     */
       private void setCodes(HNode root, String code) {

        root.setCode(code);
    }
}// end HuffmanCode

