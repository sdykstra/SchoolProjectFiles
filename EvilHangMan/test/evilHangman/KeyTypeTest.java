/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evilHangman;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author FT
 */
public class KeyTypeTest {
    
    public KeyTypeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCount method, of class KeyType.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int newCount = 0;
        KeyType instance = null;
        instance.setCount(newCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class KeyType.
     */
    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String keyString = "";
        KeyType instance = null;
        instance.setKey(keyString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class KeyType.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        KeyType instance = null;
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class KeyType.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        KeyType instance = null;
        String expResult = "";
        String result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
