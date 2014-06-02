
/**
 * Write a description of class HNode here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public class HNode extends BTNode<HNode> {

    private HNode right;
    private HNode left;
    private String code;
    private Character symbol;
    private double frequency;

    /**
     * HNode Simple constructor - set all fields to null or 0.
     */
    public HNode() {
        right = null;
        left = null;
        code = null;
        symbol = null;
        frequency = 0;
    }

    /**
     * HNode Constructor that sets the symbol only.
     *
     * @param symbol - the symbol
     */
    public HNode(Character symbol) {
        right = null;
        left = null;
        code = null;
        this.symbol = symbol;
        frequency = 0;
    }

    /**
     * HNode Constructor that sets the symbol and frequency.
     *
     * @param symbol - the symbol frequency - the frequency of occurrence for
     * the symbol
     */
    public HNode(Character symbol, double frequency) {

        this.symbol = symbol;
        this.frequency = frequency;
        code = null;
        right = null;
        left = null;
    }

    /**
     * HNode Constructor that sets symbol, frequency, and code.
     *
     * @param symbol - the symbol frequency - the frequency of occurrence for
     * the symbol code - the code for the symbol
     */
    public HNode(Character symbol, double frequency, String code) {

        this.symbol = symbol;
        this.frequency = frequency;
        this.code = code;
        right = null;
        left = null;
    }

    /**
     * HNode Fully parameterized constructor.
     *
     * @param symbol - the symbol frequency - the frequency of occurrence for
     * the symbol code - the code for the symbol left - link to the left child
     * right - link to the right child
     *
     */
    public HNode(Character symbol, double frequency, String code, HNode left, HNode right) {


        this.symbol = symbol;
        this.frequency = frequency;
        this.code = code;
        this.right = right;
        this.left = left;
    }

    /**
     * compareTo Comparison method considers frequency only. Specified by:
     * compareTo in interface Comparable<HNode>
     *
     *
     * @param n - object to be compared with this
     * @return a negative integer, zero, or a positive integer as this object is
     * less than, equal to, or greater than the specified object.
     * @throws NullPointerException - if the specified object is null
     */
    public int compareTo(HNode n) {
        if (this.frequency == n.frequency) {
            return 0;
        } else if (this.frequency > n.frequency) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * equals Equals predicate considers the symbol and frequency only.
     * Overrides: equals in class BTNode<HuffmanData>
     *
     * @param o - the object to check for equality
     * @return true if both the symbol and the frequency agree; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        HuffmanData huff = new HuffmanData(this.symbol, this.frequency, this.code);

        if (huff.equals(o)) {
            return true;
        } else {
            return false;
        }
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
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * getLeftChild Access the left child. Overrides:getLeftChild in class
     * BTNode<HuffmanData>
     *
     * @return the left child of this node
     */
    public HNode getLeftChild() {
        return this.left;
    }

    /**
     * getRightChild
     *
     * Access the right child. Overrides: getRightChild in class
     * BTNode<HuffmanData> * Returns: the right child of this node
     */
    public HNode getRightChild() {
        return this.right;
    }

    /**
     * getSymbol Access the symbol.
     *
     * @return the symbol
     */
    public Character getSymbol() {
        return symbol;
    }

    /**
     * hashCode Define hashcode for HNode. If two objects are equal according to
     * the equals(Object) method, then calling the hashCode method on each of
     * the two objects produces the same integer result.
     *
     * Overrides: hashCode in class BTNode<HuffmanData>
     *
     *
     * @return a hash code value for this object
     */
    public int hashCode() {
        return (int) ((this.frequency + this.symbol)) * 100;

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
     */
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    /**
     * setSymbol Modify the symbol.
     *
     * @param symbol - the new symbol
     */
    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }
}// end HNode
