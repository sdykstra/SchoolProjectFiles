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
public class TerminalUITest extends TestCase {
    
    public TerminalUITest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TerminalUITest.class);
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
     * Test of printToUser method, of class TerminalUI.
     */
    public void testPrintToUser() {
        System.out.println("printToUser");
        String out = "";
        TerminalUI instance = new TerminalUI();
        instance.printToUser(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of question method, of class TerminalUI.
     */
    public void testQuestion() {
        System.out.println("question");
        String input = "";
        TerminalUI instance = new TerminalUI();
        String expResult = "";
        String result = instance.question(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChooseYesOrNo method, of class TerminalUI.
     */
    public void testChooseYesOrNo() {
        System.out.println("ChooseYesOrNo");
        String question = "";
        TerminalUI instance = new TerminalUI();
        boolean expResult = false;
        boolean result = instance.ChooseYesOrNo(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userCompare method, of class TerminalUI.
     */
    public void testUserCompare() {
        System.out.println("userCompare");
        String question = "";
        TerminalUI instance = new TerminalUI();
        int expResult = 0;
        int result = instance.userCompare(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
