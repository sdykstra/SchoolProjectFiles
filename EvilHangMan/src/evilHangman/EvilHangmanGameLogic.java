package evilHangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a description of class GameLogic here.
 *
 * @author Scott Dykstra
 * @version v3.3 October 18,2012
 */
public class EvilHangmanGameLogic {

    private String wordToGuess = null;
    protected ArrayList<String> wordList;
    private File file = null;
    private Scanner keys = new Scanner(System.in);
    private int guessNumber = 0;
    private int wordSize = 0;
    private StringBuffer guessedWordBuffer, wordBuffer;
    private String guessedWord = null;
    private String keyString = null;
    private SortedSet<Character> guessedLetters;
    // private TreeMap wordTreeList;
    private KeyType thisKey;
    private ArrayList<KeyType> keyArray = new ArrayList<KeyType>();
    //private Random randomNum = new Random();

    public EvilHangmanGameLogic(int wordsize, int guessSize) {
        this.wordSize = wordsize;
        wordList = new ArrayList<String>();
        getList(wordSize);
        guessNumber = guessSize;
        guessedLetters = new TreeSet<Character>();


    }// end construtor GameLogic

    /**
     * Get file list for int word length, and puts the file content into an
     * Array if the word is of proper length.
     */
    private void getList(int number) {

        if (number > 2 && number < 11) {
            String word;
            Scanner input = null;
            try {
                input = new Scanner(new FileReader("dictionary.txt"));
                while (input.hasNext()) {
                    word = input.next();
                    if (number == word.length()) {
                        wordList.add(word.toLowerCase());
                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(EvilHangmanGameLogic.class.getName()).log(Level.SEVERE, null, ex);
            }

            char positions[] = new char[wordSize];
            for (int i = 0; i < wordSize; i++) {
                positions[i] = '_';
            }
            String s = new String(positions);
            guessedWordBuffer = new StringBuffer(s);
            guessedWord = guessedWordBuffer.toString();
            wordToGuess = guessedWordBuffer.toString();


        } else {
            System.out.print("Please enter a different size word smaller then ten");
            int n = keys.nextInt();
            wordSize = n;
            getList(wordSize);
        }
    } // end getList

    /**
     * Returns the wordToGuess if word is complete or game is over.
     */
    public String getWord() {

        String s = wordToGuess;

        return s;
    }//end getWord

    /**
     * Sets the length of the game by setting the number of guesses available
     */
    public void setGuessNumber(int numIn) {
        guessNumber = numIn;
    }//setGuessNumber

    /**
     * Return the number of guesses left.
     */
    public int getGuessesLeft() {
        int guesses = guessNumber;
        return guesses;
    }

    /**
     * Checks to see if letter is on list and return a boolean. Also adds that
     * letter to list if not on the list.
     */
    public boolean canUseLetterGuessed(char letter) {
        if (guessedLetters.equals(letter)) {
            return false;
        } else {
            guessedLetters.add(letter);
            return true;
        }
    }// end canUseLetterGuessed

    /**
     * Returns the letters Guessed in Sorted list.
     */
    public SortedSet<Character> returnGuessedLetters() {
        return guessedLetters;
    }

    /**
     * Returns the String containing the word string of correct guesses.
     */
    public String returnGuessedWord() {
        return guessedWord;
    }// end returnGuessedWord

    /**
     * This method will count the number of times the chosen letter is used in
     * the picked word, using the guessed word as the key and checking that.
     */
    public int numberOfTimeLetterUsed(char letter) {
        int num = 0;
        for (int i = 0; i < wordSize; i++) {
            if (letter == keyString.charAt(i)) {
                num++;
            }
        }
        return num;
    }

    /**
     * Checks to see if player can guess again. The int counter is used to keep
     * track of the number of guesses used.Will return true until number of
     * guesses is reached then it will return false and the game will be over
     * unless game has been won then it should not be checked.
     */
    public boolean canGuess() {

        if (guessNumber == 0) {
            return false;
        } else {
            return true;
        }
    }// end canGuess

    /**
     * This method checks the letters in the wordToGuess to see if it is
     * incomplete, this will be indicated buy the number of blanks that are
     * still in the word, and will return false if any are still there.
     */
    public boolean WordComplete() {
        int blank = 0;
        int i = 0;

        while (wordSize > i) {
            if ('-' != wordToGuess.charAt(i)) {
                blank++;
            }
            i++;
        }
        if (blank == 0) {
            return true;
        } else {
            return false;
        }
    }// end WordComplete

    /**
     * This method parses a tree to find a word from the longest pattern matched
     * list regardless if the letter is used or not.
     */
    public void findWordToGuess(char newLetter) {// have to look at when this is call to make sure that it will not have problems in evil hangman.
        ArrayList<String> newWordList = new ArrayList<String>();


        keyArray.clear();

        for (String currentWord : wordList) {

            String newKey = getKey(currentWord, newLetter, guessedWord);
            addKey(newKey);
        }
        String key = returnBiggestKey();

        System.out.println("BiggestKey" + key);////////////////////////////////////////////////////////

        int numMathces = 0;

        for (String currentWord : wordList) {
            int match = 0;
            for (int k = 0; k < wordSize; k++) {

                if (key.charAt(k) != '-') {
                    if (currentWord.charAt(k) == key.charAt(k)) {
                        match++;

                    }
                }
                if (match == wordSize) {
                    newWordList.add(currentWord);
                    numMathces++;
                }
            }
        }
        if (numMathces > 0) {

            wordList.clear();

            for (String move : newWordList) {
                wordList.add(move);
                System.out.print(" new list " + move);///////////////////////////////////////////////////////

            }
            newWordList.clear();
        }

        System.out.println("");///////////////////////////////////////////////////////

        System.out.println("wordList Size" + wordList.size());///////////////////////////////////////////////////////
        wordToGuess = wordList.get(0);

        guessNumber--;
    }//end findWordToGuess

    /*
     * This method will check each letter of word to see if it contains the
     * chosen letter returns the key frame of those chosen letters.
     */
    public String getKey(String currentWord, char letter, String wordtoguess) {
        String newKey = null;


        String keyWord = guessedWord;
        wordBuffer = new StringBuffer(keyWord);

        for (int i = 0; i < wordSize; i++) {
            if (wordtoguess.charAt(i) == '_' && currentWord.charAt(i) == letter) {
                wordBuffer.setCharAt(i, letter);

            }
        }// end for

        newKey = wordBuffer.toString();

        return newKey;
    }// end getKey

    /*
     * This method collects the keys into one place, and counts then.
     */
    private void addKey(String newKey) {
        int numCount = 0;

        int found = 0;
        if (keyArray.isEmpty()) {

            keyArray.add(thisKey = new KeyType(newKey, 0));
        } else {
            for (int i = 0; i < keyArray.size(); i++) {
                this.thisKey = keyArray.get(i);
                numCount = this.thisKey.getCount();

                if (this.thisKey.getKey().equals(newKey)) {
                    found++;
                    numCount++;
                    this.thisKey.setCount(numCount);
                    keyArray.set(i, this.thisKey);
                    break;
                }
            }// end for loop
        }
        if (found == 0) {
            this.thisKey = new KeyType(newKey, 1);
            keyArray.add(this.thisKey);
        }

    }//end addKey

    public String returnBiggestKey() {
        String returnKey = null;
        KeyType temp1 = null;
        KeyType temp2 = null;
        KeyType temp3 = new KeyType(returnKey, 0);


        for (int i = 0; i < keyArray.size() - 1; i++) {
            temp1 = keyArray.get(i);
            temp2 = keyArray.get(i + 1);

            if (temp1.getCount() < temp2.getCount()) {
                if (temp3.getCount() < temp2.getCount()) {
                    temp3 = temp2;
                }


            } else {
                if (temp3.getCount() > temp1.getCount()) {
                    temp3 = temp1;
                }
            }
            keyString = returnKey = temp3.getKey();
        }

        return returnKey;
    }//end returnBiggestKey
}// end EvilHangmanGameLogic

