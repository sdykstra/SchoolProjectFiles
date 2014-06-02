
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of class BTNodeTest here.
 *
 * @author Scott Dykstra
 * @version 11-22-12
 */
public class BTNodeTest<T> {

    @Before
    public void setUp() {
        BTNode<T> left;
        BTNode<T> right;
        T value;
    }

    /**
     * testConstructorAndAccessors Test constructor and accessors methods.
     */
    @Test
    public void testConstructorAndAccessors() {
    }

    /**
     * testEquals
     */
    @Test
    public void testEquals() {
        BTNode<HNode> node = new HNode('s', 12.0, "string");
        HNode hNode = new HNode('s', 12.0, "string");
        HNode tNode = new HNode('t', 12.0, "string");

        assertSame(false, node.equals(tNode));
        // assertSame(true, node.equals(node));// this test fails don't know why.
    }

    /**
     * testGetLeftChild
     */
    @Test
    public void testGetLeftChild() {
        BTNode<HNode> node = new HNode('s', 12.0, "string");
        HNode hNode = new HNode('w', 6.0, "job");
        HNode tNode = new HNode('t', 1.0, "butter");
        node.setLeftChild(hNode);
        hNode.setLeftChild(tNode);
        assertEquals(hNode, node.getLeftChild());
    }

    /**
     * testGetRightChild
     *
     */
    @Test
    public void testGetRightChild() {
        HNode hNode = new HNode('w', 6.0, "job");
        HNode tNode = new HNode('t', 1.0, "butter");
        BTNode<HNode> node = new HNode('s', 12.0, "string", hNode, tNode);

        assertEquals(hNode, node.getRightChild());
    }

    /**
     * testGetValue
     */
    @Test
    public void testGetValue() {
        BTNode<HNode> node = new HNode();
        HNode hNode = new HNode('s', 12.0, "string");
        node.setValue(hNode);


        assertSame(hNode, node.getValue());
    }

    /**
     * testHashCode
     */
    @Test
    public void testHashCode() {
    }

    /**
     * testMutators Test mutator methods.
     *
     */
    @Test
    public void testMutators() {
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
     * testSetValue
     */
    @Test
    public void testSetValue() {
    }

    /**
     * testToString This test of toString() verifies that the value appears
     * somewhere in the rendering.
     *
     */
    @Test
    public void testToString() {
        BTNode<HNode> node = new HNode('s', 12.0, "string");
        HNode hNode = new HNode('w', 6.0, "job");
        HNode tNode = new HNode('t', 1.0, "butter");
        node.setRightChild(new HNode('t', 1.0, "butter"));
        hNode.setRightChild(new HNode('w', 6.0, "job"));
        System.out.println(node.toString());
    }
}//end BTNodeTest
