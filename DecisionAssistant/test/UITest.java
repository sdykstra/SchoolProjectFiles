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
public class UITest extends TestCase {
    
    public UITest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UITest.class);
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
     * Test of printToUser method, of class UI.
     */
    public void testPrintToUser() {
        System.out.println("printToUser");
        String print = "";
        UI instance = new UIImpl();
        instance.printToUser(print);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of question method, of class UI.
     */
    public void testQuestion() {
        System.out.println("question");
        String input = "";
        UI instance = new UIImpl();
        String expResult = "";
        String result = instance.question(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChooseYesOrNo method, of class UI.
     */
    public void testChooseYesOrNo() {
        System.out.println("ChooseYesOrNo");
        String question = "";
        UI instance = new UIImpl();
        boolean expResult = false;
        boolean result = instance.ChooseYesOrNo(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userCompare method, of class UI.
     */
    public void testUserCompare() {
        System.out.println("userCompare");
        String question = "";
        UI instance = new UIImpl();
        int expResult = 0;
        int result = instance.userCompare(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UIImpl implements UI {

        public void printToUser(String print) {
        }

        public String question(String input) {
            return "";
        }

        public boolean ChooseYesOrNo(String question) {
            return false;
        }

        public int userCompare(String question) {
            return 0;
        }
    }
}
