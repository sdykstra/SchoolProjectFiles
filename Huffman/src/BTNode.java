
/**
 * Write a description of class BTNode here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public abstract class BTNode<T> implements java.lang.Comparable<T> {

    /**
     * left Reference to left child.
     */
    private BTNode<T> left;
    /**
     * right Reference to right child.
     */
    private BTNode<T> right;
    /**
     * value The value stored at this node. Constructor Detail
     */
    private T value;

    /**
     * BTNode Constructor that sets value & links to null.
     */
    public BTNode() {
        right = null;
        left = null;
        this.value = null;
    }

    /**
     * BTNode Constructor that sets value from parameter and both links to null.
     * Parameters: value - the value to be stored at this node
     */
    public BTNode(T value) {
        right = null;
        left = null;
        this.value = value;
        value = (T)"s";
    }

    /**
     * BTNode Fully parameterized constructor. Parameters: value - the value to
     * be stored at this node leftChild - the link to left child rightChild -
     * the link to right child
     */
    public BTNode(T value, BTNode<T> leftChild, BTNode<T> rightChild) {
        right = rightChild;
        left = leftChild;
        this.value = value;
    }

    /**
     * equals Define equality for BTNodes. Indicates whether some other object
     * is "equal to" this one. The equals method implements an equivalence
     * relation on non-null object references: It is reflexive: for any non-null
     * reference value x, x.equals(x) should return true. It is symmetric: for
     * any non-null reference values x and y, x.equals(y) should return true if
     * and only if y.equals(x) returns true. It is transitive: for any non-null
     * reference values x, y, and z, if x.equals(y) returns true and y.equals(z)
     * returns true, then x.equals(z) should return true. It is consistent: for
     * any non-null reference values x and y, multiple invocations of
     * x.equals(y) consistently return true or consistently return false,
     * provided no information used in equals comparisons on the objects is
     * modified. For any non-null reference value x, x.equals(null) should
     * return false. Overrides: equals in class Object
     *
     * @param the reference object with which to compare
     * @return true if this object is the same as the obj argument; false
     * otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof BTNode) {
            
            if (this.equals(o)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    /**
     * getLeftChild Retrieve this node's left child. Returns: the left child
     */
    public BTNode<T> getLeftChild() {
        return this.left;
    }

    /**
     * getRightChild Retrieve this node's right child. Returns: the right child
     */
    public BTNode<T> getRightChild() {
        return this.right;

    }

    /**
     * getValue Retrieve the value stored at this node. Returns: the value
     * stored at this node
     */
    public T getValue() {
        return value;

    }

    /**
     * hashCode Define hashcode for BTNodes. If two objects are equal according
     * to the equals(Object) method, then calling the hashCode method on each of
     * the two objects produces the same integer result.
     *
     * Overrides: hashCode in class Object Returns: a hash code value for this
     * object
     */
    @Override
    public int hashCode() {
        int salt = 29;

        return value != null ? value.hashCode() * 42 + salt : salt;
    }

    /**
     * setLeftChild Change the link to the left child of this node. Parameters:
     * leftChild - the new left child
     */
    public void setLeftChild(BTNode<T> leftChild) {
        this.left = leftChild;
    }

    /**
     * setRightChild Change the link to the right child of this node.
     * Parameters: rightChild - the new right child
     */
    public void setRightChild(BTNode<T> rightChild) {
        this.right = rightChild;
    }

    /**
     * setValue Change the value stored at this node. Parameters: value - the
     * new value to be stored
     *
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * toString Overrides: toString in class Object
     *
     */
    @Override
    public String toString() {
        
        return "(" + value + " , " + right + " , " + left + ")";
    }
}//end BTNode
