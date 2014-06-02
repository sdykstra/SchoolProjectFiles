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
public class QuestionScoreTest extends TestCase {
    
    public QuestionScoreTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(QuestionScoreTest.class);
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
     * Test of setScore method, of class QuestionScore.
     */
    public void testSetScore() {
        System.out.println("setScore");
        double s = 0.0;
        QuestionScore instance = new QuestionScore();
        instance.setScore(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class QuestionScore.
     */
    public void testGetQuestion() {
        System.out.println("getQuestion");
        QuestionScore instance = new QuestionScore();
        String expResult = "";
        String result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class QuestionScore.
     */
    public void testGetScore() {
        System.out.println("getScore");
        QuestionScore instance = new QuestionScore();
        double expResult = 0.0;
        double result = instance.getScore();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class QuestionScore.
     */
    public void testToString() {
        System.out.println("toString");
        QuestionScore instance = new QuestionScore();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
