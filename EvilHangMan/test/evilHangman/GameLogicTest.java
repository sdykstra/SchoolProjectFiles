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
public class GameLogicTest {
    
    public GameLogicTest() {
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
     * Test of getWord method, of class GameLogic.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        GameLogic instance = null;
        String expResult = "";
        String result = instance.getWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGuessNumber method, of class GameLogic.
     */
    @Test
    public void testSetGuessNumber() {
        System.out.println("setGuessNumber");
        int numIn = 0;
        GameLogic instance = null;
        instance.setGuessNumber(numIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGuessesLeft method, of class GameLogic.
     */
    @Test
    public void testGetGuessesLeft() {
        System.out.println("getGuessesLeft");
        GameLogic instance = null;
        int expResult = 0;
        int result = instance.getGuessesLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewList method, of class GameLogic.
     */
    @Test
    public void testGetNewList() {
        System.out.println("getNewList");
        char ChosenLetter = ' ';
        GameLogic instance = null;
        String expResult = "";
        String result = instance.getNewList(ChosenLetter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLetterToGussedList method, of class GameLogic.
     */
    @Test
    public void testAddLetterToGussedList() {
        System.out.println("addLetterToGussedList");
        String letterguesed = "";
        GameLogic instance = null;
        boolean expResult = false;
        boolean result = instance.addLetterToGussedList(letterguesed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnGuessedLetters method, of class GameLogic.
     */
    @Test
    public void testReturnGuessedLetters() {
        System.out.println("returnGuessedLetters");
        GameLogic instance = null;
        String expResult = "";
        String result = instance.returnGuessedLetters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnGuessedWord method, of class GameLogic.
     */
    @Test
    public void testReturnGuessedWord() {
        System.out.println("returnGuessedWord");
        GameLogic instance = null;
        String expResult = "";
        String result = instance.returnGuessedWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canUseLetterGuessed method, of class GameLogic.
     */
    @Test
    public void testCanUseLetterGuessed() {
        System.out.println("canUseLetterGuessed");
        char newLetter = ' ';
        GameLogic instance = null;
        int expResult = 0;
        int result = instance.canUseLetterGuessed(newLetter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canGuess method, of class GameLogic.
     */
    @Test
    public void testCanGuess() {
        System.out.println("canGuess");
        GameLogic instance = null;
        boolean expResult = false;
        boolean result = instance.canGuess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WordComplete method, of class GameLogic.
     */
    @Test
    public void testWordComplete() {
        System.out.println("WordComplete");
        GameLogic instance = null;
        boolean expResult = false;
        boolean result = instance.WordComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
