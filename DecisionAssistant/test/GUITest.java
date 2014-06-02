/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author FT
 */
public class GUITest extends TestCase {
    
    public GUITest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GUITest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of printToUser method, of class GUI.
     */
    public void testPrintToUser() {
        System.out.println("printToUser");
        String print = "";
        GUI instance = new GUI();
        instance.printToUser(print);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of question method, of class GUI.
     */
    public void testQuestion() {
        System.out.println("question");
        String message = "";
        GUI instance = new GUI();
        String expResult = "";
        String result = instance.question(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChooseYesOrNo method, of class GUI.
     */
    public void testChooseYesOrNo() {
        System.out.println("ChooseYesOrNo");
        String question = "";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.ChooseYesOrNo(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userCompare method, of class GUI.
     */
    public void testUserCompare() {
        System.out.println("userCompare");
        String question = "";
        GUI instance = new GUI();
        int expResult = 0;
        int result = instance.userCompare(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
