
import java.util.Scanner;

/**
 * @author Scott Dykstra
 * @version 10-23-2012
 */
public class TerminalUI implements UI {

    Scanner keyboard = new Scanner(System.in);

    /**
     * Print to text information to the user.
     *
     * @param info inform user of program response.
     */
    @Override
    public void printToUser(String out) {
        System.out.println(out);
    }

   

    /**
     * Inform user and ask for answer to new question question
     *
     * @param send message to ask the user for input
     * @return string entered by user
     */
    @Override
    public String question(String input) {
        System.out.printf("%s\n", input);
        String  string= keyboard.nextLine();
        return string;
    }

    /**
     * Ask the user to respond with YES or NO.
     *
     * @param message for user to answer question.
     * @return true if user selects YES, false otherwise
     */
    @Override
    public boolean ChooseYesOrNo(String question) {

        if ('y' == question(question).toLowerCase().charAt(0)) {
            return true;
        } else {
            return false;

        }
    }
/**
     * Ask the user for a number value to rate the choice.
     * @param question to ask user.
     * @return int value
     */
    @Override
    public int userCompare(String question) {
                System.out.printf("%s\n",question);
         int num = keyboard.nextInt();
         return num;
    }
}// end TerminalUI
