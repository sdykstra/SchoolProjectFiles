
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 * @version 12/01/12
 */
public class HuffmanCoder {

    public static void main(String args[]) {
        Scanner reader = null;

        String word = null;

        try {
            reader = new Scanner(new FileReader("Huffman.txt"));
            if ((reader.hasNext())) {
                word = reader.nextLine();
                while (reader.hasNext()) {

                    word += reader.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception for Huffman.txt" + ex);
        }



        HuffmanCode huffCode = null;

        huffCode = new HuffmanCode(word);
        huffCode.getCodeTree();
        huffCode.getCodeMap();

        String codedString = huffCode.encode(word);

        String decoded = huffCode.decode(codedString);

    }//end main
}// end HuffmanCoder

