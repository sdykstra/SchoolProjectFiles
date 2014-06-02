
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Write a description of class HNodeTest here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public class HNodeTest {

    private HNode root;
    private HNode right;
    private HNode left;
    private String code;
    private Character symbol;
    private double frequency;
    private String word = null;
    private HuffmanData huffdata = null;
    private HuffmanCode huffCode;

    /**
     * HNodeTest
     */
    public HNodeTest() {
    }

    /**
     * setUp Sets up the test fixture. Called before every test case method.
     *
     */
    public void setUp() {

        left = new HNode('l', 1.2, "left");
        right = new HNode('r', 2.1, "right");
        root = new HNode('f', 3, "root", left, right);

        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');

        ArrayList<Integer> numArray = new ArrayList<Integer>();
        numArray.add(4);
        numArray.add(7);
        numArray.add(9);
        numArray.add(12);
        numArray.add(1);
        numArray.add(3);
        numArray.add(4);
        numArray.add(66);


        HNode node = new HNode('s', 5);
        int i = 0;
        while (i < list.size()) {


            node.setLeftChild(new HNode(list.get(i), numArray.get(i)));
            if (i < numArray.size()) {
                i++;
                node.setRightChild(new HNode(list.get(i), numArray.get(i)));
                i++;
            }
        }
    }

    /**
     * tearDown Tears down the test fixture. Called after every test case
     * method.
     *
     */
    public void tearDown() {
    }

    /**
     * testAll Test constructors, accessors, and mutators.
     *
     */
    @Test
    public void testAll() {
        word = "eabcdfghi";

        huffCode = new HuffmanCode(word);
        huffCode.getCodeTree();
        huffCode.getCodeMap();

        String codedString = huffCode.encode(word);
        System.out.println("codedString " + codedString);

        String decoded = huffCode.decode(codedString);
        System.out.println("decodedString " + decoded);
    }

    /**
     * testCompareTo
     */
    @Test
    public void testCompareTo() {
    }

    /**
     * testEquals
     */
    @Test
    public void testEquals() {
        


        assertEquals(root, root.equals(root));

    }

    /**
     * testGetCode
     */
    @Test
    public void testGetCode() {
        code = "01010";
        HNode node = new HNode('d', 7, code);
        String returnValue = node.getCode();
        assertEquals(code, returnValue);
        //  assertEquals("000000", returnValue);
    }

    /**
     * testGetFrequency
     */
    @Test
    public void testGetFrequency() {
        HNode node = new HNode('d', 7, code);
        double returnValue = node.getFrequency();
        assertEquals(7.0, returnValue, 001);
        // assertSame(100, returnValue);
        assertSame(7.0, returnValue);
    }

    /**
     * testGetLeftChild
     */
    @Test
    public void testGetLeftChild() {
        assertEquals(left, root.getLeftChild());
    }

    /**
     * testGetRightChild
     */
    @Test
    public void testGetRightChild() {
        assertEquals(right, root.getRightChild());

    }

    /**
     * testGetSymbol
     */
    @Test
    public void testGetSymbol() {
        assertEquals(right, root.getRightChild());

    }

    /**
     * testSetCode
     */
    @Test
    public void testSetCode() {
    }

    /**
     * testSetFrequency
     */
    @Test
    public void testSetFrequency() {
    }

    /**
     * testSetLeftChild
     */
    @Test
    public void testSetLeftChild() {
    }

    /**
     * testSetRightChild
     */
    @Test
    public void testSetRightChild() {
    }

    /**
     * testSetSymbol
     */
    @Test
    public void testSetSymbol() {
    }
}//end HNode
