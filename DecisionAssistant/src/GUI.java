
import javax.swing.JOptionPane;

/**
 * @author Scott Dykstra
 * @version 10-23-2012
 */
public class GUI implements UI {

    public GUI() {
    }

    /**
     * Print to text information to the user.
     *
     * @param print inform user of program response.
     */
    @Override
    public void printToUser(String print) {
        JOptionPane.showMessageDialog(null,
                print,
                "Decision Assistant",
                JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * Inform user and ask for answer to new question question
     *
     * @param send message to ask the user for input
     * @return string entered by user
     */
    @Override
    public String question(String message) {
        String userInput = (String) JOptionPane.showInputDialog(
                null,
                message,
                "Choice Aspect",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);
        if (null == userInput) {
            System.exit(-1);
        }

        return userInput;
    }

    /**
     * Ask the user to respond with YES or NO.
     *
     * @param message for user to answer question.
     * @return true if user selects YES, false otherwise
     */
    @Override
    public boolean ChooseYesOrNo(String question) {
        return (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(
                null,
                question,
                "Choose Yes or No",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null));

    }

    /**
     * Ask the user for a number value to rate the choice.
     *
     * @param question to ask user.
     * @return int value
     */
    @Override
    public int userCompare(String question) {
        int num = 0;

        String userInput = (String) JOptionPane.showInputDialog(
                null,
                question,
                "Pick between 1 and 10",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);
        if (null == userInput) {
            System.exit(-1);
        }
        num = Integer.parseInt(userInput);
        return num;
    }
}// end GUI

