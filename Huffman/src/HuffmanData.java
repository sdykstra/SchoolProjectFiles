
/**
 * Write a description of class HuffmanData here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public class HuffmanData {

    /**
     * code The Huffman code for this node ; null if none.
     */
    private String code;
    /**
     * EPSILON Maximum difference to accept two double values as equal . See
     * Also : Constant Field Values
     * ( this is in the java doc some where as .001)/////////////////////////////////////////////////
     */
    public static final double EPSILON = 0;
    /**
     * frq The frequency stored at this node.
     */
    private double frq;
    /**
     * sym The symbol stored at this node null if none.Constructor Detail
     */
    private Character sym;

    /**
     * HuffmanData Simple constructor - set all fields to null or 0.
     *
     */
    public HuffmanData() {
        code = null;
        sym = null;
        frq = 0;
    }

    /** 
     * HuffmanData Constructor that sets the symbol only.
     *
     * @param symbol - the symbol
     */
    public HuffmanData(Character symbol) {
        code = null;
        sym = symbol;
        frq = 0;
    }

    /**
     * HuffmanData Constructor that sets the symbol and frequency.
     *
     * @param symbol - the symbol frequency - the frequency of occurrence for
     * the symbol
     */
    public HuffmanData(Character symbol, double frequency) {
        code = null;
        sym = symbol;
        frq = frequency;
        
    }

    /**
     * HuffmanData Constructor that sets symbol, frequency, and code.
     *
     * @param symbol - the symbol frequency - the frequency of occurrence for
     * the symbol code - the code for the symbol
     */
    public HuffmanData(Character symbol, double frequency, String code) {
    }

    /**
     * compareTo Comparison method considers frequency only.
     *
     * @param n - object to be compared with this
     * @return a negative integer, zero, or a positive integer as this object is
     * less than, equal to, or greater than the specified object.
     *
     */
    public int compareTo(HuffmanData n) {
        
        return this.compareTo(n);
    }

    /**
     * equals Equals predicate considers the symbol and frequency only.
     * Overrides: equals in class Object
     *
     * @param o - the object to check for equality
     * @return true if both the symbol and the frequency agree; false otherwise
     */
    public boolean equals(HuffmanData node) {
       return this.equals(node);
    }

    /**
     * getCode Access the code.
     *
     * @return the code associated with the symbol
     */
    public String getCode() {
        return code;
    }

    /**
     * getFrequency Access the frequency.
     *
     * @return the frequency of occurrence
     *
     */
    public double getFrequency() {
        return frq;
    }

    /**
     * getSymbol Access the symbol.
     *
     * @return the symbol
     *
     */
    public Character getSymbol() {
        return sym;
    }

    /**
     * hashCode Define hashcode for HuffmanData. If two objects are equal
     * according to the equals(Object) method, then calling the hashCode method
     * on each of the two objects produces the same integer result.
     *
     * Overrides: hashCode in class Object
     *
     * @return a hash code value for this object
     *
     */
    @Override
    public int hashCode() {
       return this.hashCode();/// need to over ride this methods ///////////////////////////////////
        
    }

    /**
     * setCode Modify the code.
     *
     * @param code - the new code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * setFrequency Modify the frequency.
     *
     * @param frequency - the new frequency
     *
     */
    public void setFrequency(double frequency) {
        frq = frequency;
    }

    /**
     * setSymbol Modify the symbol.
     *
     * @param symbol - the new symbol
     *
     */
    public void setSymbol(Character symbol) {
        sym = symbol;
    }

    /**
     * toString String representation of this object. Format: <HD: char ,
     * frequency, code > Overrides : toString in class Object
     *
     *
     * @return the string representation
     */
    public String toString() {
        return "<HD:"+ sym+" , "+ frq+" , "+ code+" >";
    }
}
