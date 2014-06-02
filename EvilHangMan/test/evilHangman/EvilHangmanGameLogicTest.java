/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evilHangman;

import java.util.ArrayList;
import java.util.SortedSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author FT
 */
public class EvilHangmanGameLogicTest {

    public static ArrayList<String> letterList = new ArrayList<String>(26);
    public static ArrayList<String> WordList = new ArrayList<String>(26);
    public static EvilHangmanGameLogic hangmanLogic;

    public EvilHangmanGameLogicTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        letterList.add("a");
        letterList.add("b");
        letterList.add("c");
        letterList.add("d");
        letterList.add("e");
        letterList.add("f");
        letterList.add("g");
        letterList.add("h");
        letterList.add("i");
        letterList.add("j");
        letterList.add("k");
        letterList.add("l");
        letterList.add("m");
        letterList.add("n");
        letterList.add("o");
        letterList.add("p");
        letterList.add("q");
        letterList.add("r");
        letterList.add("s");
        letterList.add("t");
        letterList.add("u");
        letterList.add("v");
        letterList.add("w");
        letterList.add("x");
        letterList.add("y");
        letterList.add("z");


        WordList.add("dog");
        WordList.add("cat");
        WordList.add("zoo");
        WordList.add("moo");
        WordList.add("goo");
        WordList.add("foo");
        WordList.add("yes");
        WordList.add("set");
        WordList.add("met");
        WordList.add("bet");
        WordList.add("get");
        WordList.add("jet");
        WordList.add("way");



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
     * Test of getWord method, of class EvilHangmanGameLogic.
     */
    @Test
    public void testGetWord() {


        System.out.println("getWord");
        EvilHangmanGameLogic instance = new EvilHangmanGameLogic(3, 20);
        String expResult = "___";
        String result = instance.getWord();
        assertEquals(expResult, result);
    }


    /**
     * Test of getGuessesLeft method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testGetGuessesLeft() {
        System.out.println("getGuessesLeft");
        EvilHangmanGameLogic instance = new EvilHangmanGameLogic(3, 20);
        int expResult = 20;
        int result = instance.getGuessesLeft();
        assertEquals(expResult, result);
        
        fail("Did not return proper number of guess left.");
    }

    /**
     * Test of canUseLetterGuessed method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testCanUseLetterGuessed() {
        System.out.println("canUseLetterGuessed");
        char letter = 'a';
        EvilHangmanGameLogic instance = new EvilHangmanGameLogic(3, 20);
        boolean expResult = true;
        boolean result = instance.canUseLetterGuessed(letter);
        assertEquals(expResult, result);
        
        fail("Some thing is the set of guessed letter");
    }

    /**
     * Test of returnGuessedLetters method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testReturnGuessedLetters() {
        System.out.println("returnGuessedLetters");
        EvilHangmanGameLogic instance = new EvilHangmanGameLogic(3, 20);
        for(int i = 0; i< 1; i++){
           
        instance.canUseLetterGuessed(letterList.get(i).charAt(i));
        }
        SortedSet expResult = null;
        SortedSet result = instance.returnGuessedLetters();
        assertEquals(expResult, result);
        
        fail("This test should fail because letters add to list");
    }

    /**
     * Test of returnGuessedWord method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testReturnGuessedWord() {
        System.out.println("returnGuessedWord");
        EvilHangmanGameLogic instance = new EvilHangmanGameLogic(3, 20);
        String expResult = null;
        String result = instance.returnGuessedWord();
        assertEquals(expResult, result);
        
        fail("Did not return null.");
    }

    /**
     * Test of numberOfTimeLetterUsed method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testNumberOfTimeLetterUsed() {
        System.out.println("numberOfTimeLetterUsed");
        char letter = ' ';
        EvilHangmanGameLogic instance = null;
        int expResult = 0;
        int result = instance.numberOfTimeLetterUsed(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canGuess method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testCanGuess() {
        System.out.println("canGuess");
        EvilHangmanGameLogic instance = null;
        boolean expResult = false;
        boolean result = instance.canGuess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WordComplete method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testWordComplete() {
        System.out.println("WordComplete");
        EvilHangmanGameLogic instance = null;
        boolean expResult = false;
        boolean result = instance.WordComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findWordToGuess method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testFindWordToGuess() {
        System.out.println("findWordToGuess");
        char newLetter = ' ';
        EvilHangmanGameLogic instance = null;
        instance.findWordToGuess(newLetter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testGetKey() {
        System.out.println("getKey");
        String word = "";
        char letter = ' ';
        String wordtoguess = "";
        EvilHangmanGameLogic instance = null;
        String expResult = "";
        String result = instance.getKey(word, letter, wordtoguess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBiggestKey method, of class EvilHangmanGameLogic.
     */
    @Test
        public void testReturnBiggestKey() {
        System.out.println("returnBiggestKey");
        EvilHangmanGameLogic instance = null;
        String expResult = "";
        String result = instance.returnBiggestKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
