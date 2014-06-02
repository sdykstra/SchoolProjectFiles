package evilHangman;

import java.util.Scanner;

/**
 * Write a description of class GameManager here.
 *
 * @author Scott Dykstra
 * @version v2.2 October 17, 2012
 */
public class EvilHangmanGameManager {

    public static Scanner keys = new Scanner(System.in);
    public static EvilHangmanGameLogic game = null;
    public static String state = null;
    public static boolean gameNotOver = true;
    public static int length = 0;
    
    
    public static void main(String[] args) {

        prepare();
        doFrame();

    }// end main

    public EvilHangmanGameManager() {
    }// end GameManager

    /**
     * Gets the name, word and number of guesses
     *
     * @param user "name", int "wordLength", int "wrongAnswers"
     * @return String to user
     */
    public static void prepare() {
        /*
         * call need methods to setup game: setPlayerName(String)
         * getNewWord(int) setGuessNumber(int)
         *
         */
        System.out.println("Welcome to the hangman word-guessing game.");

        System.out.println("What length word do you want to use?");
        int wordlength = keys.nextInt();


        System.out.println("How many wrong answers allowed?");
        int wrongAnswers = keys.nextInt();

        game = new EvilHangmanGameLogic(wordlength, wrongAnswers);


        System.out.println(game.getWord());
        state = "ready";
    }// end prepare

    public static void doFrame() {
        length = game.getWord().length();
        do {
            int useLetter = 0;
            String guess = null;
            boolean usedAgain = false;
            
            if ("ready".equals(state)) {

                System.out.printf("guesses left;%s \nguessed: %s\ncurrent : %s\n"  , 
                        game.getGuessesLeft(), 
                        game.returnGuessedLetters(),
                        game.returnGuessedWord());

            }

            gameNotOver = game.canGuess();

            if (gameNotOver) {
                System.out.println("Your guess?");
                guess = keys.next().toLowerCase();
                char[] guessedChar = guess.toCharArray();
                char letter = guessedChar[0];
                                    
                usedAgain = game.canUseLetterGuessed(letter);
                game.findWordToGuess(letter);
                 useLetter = game.numberOfTimeLetterUsed(letter);
                
                if (usedAgain) {
                    if (useLetter > 0) {
                        System.out.printf("\nYes there is %d %s \n\n", useLetter, letter);
                    } else {
                        System.out.printf("\nNo there are no %s \n\n", letter);
                    }

                } else {
                    System.out.printf("You already guessed %s\n\n", letter);
                }
            } 
            if (game.WordComplete()) {
                System.out.println("You have won!");
                gameNotOver = false;
            }
        } while (gameNotOver);
        
        
        if (!game.WordComplete()){
            System.out.println("Sorry you Lose");
            System.out.printf("Answer = %s\n", game.getWord());
        }
        System.out.println("Would you like to play again?");
        String again = keys.next();
        
        if ("y".equals(again) || "yes".equals(again)) {
            System.out.println("How many wrong answers allowed?");
            int wrongAnswers = keys.nextInt();

            game = new EvilHangmanGameLogic(length, wrongAnswers);
            doFrame();
        }else{
            System.exit(0);
        }

    }// end doFrame
}//end EvilHangmanGameManager
