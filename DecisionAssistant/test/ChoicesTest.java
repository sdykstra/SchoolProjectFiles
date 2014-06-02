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
public class ChoicesTest extends TestCase {
    
    public ChoicesTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ChoicesTest.class);
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
     * Test of addQuestion method, of class Choices.
     */
    public void testAddQuestion() {
        System.out.println("addQuestion");
        String question = "";
        int num = 0;
        Choices instance = null;
        instance.addQuestion(question, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetScore method, of class Choices.
     */
    public void testSetScore() {
        System.out.println("SetScore");
        int scoreIn = 0;
        int num = 0;
        Choices instance = null;
        instance.SetScore(scoreIn, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Choices.
     */
    public void testGetScore() {
        System.out.println("getScore");
        int num = 0;
        Choices instance = null;
        double expResult = 0.0;
        double result = instance.getScore(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Choices.
     */
    public void testToString() {
        System.out.println("toString");
        Choices instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinalScore method, of class Choices.
     */
    public void testSetFinalScore() {
        System.out.println("setFinalScore");
        double num = 0.0;
        Choices instance = null;
        instance.setFinalScore(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
