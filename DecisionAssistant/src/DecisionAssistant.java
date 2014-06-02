
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Scott Dykstra
 * @version 11-07-2012
 *
 */
public class DecisionAssistant {

    public static Choices choice;
    public static Scanner keys = new Scanner(System.in);
    public static UI ui;
    public static Decider decider;
    public static ArrayList<Choices> choicesToDecide = new ArrayList<Choices>();
    public static ArrayList<QuestionScore> characteristics = new ArrayList<QuestionScore>();

    public static void main(String[] args) {

        int number = 0;
        String interFaceState = null;
        System.out.printf("Please enter type of input that you want to use,\n "
                + "c for command line or g for graphical user interface.\n");
        interFaceState = keys.nextLine();
        while (number == 0) {
            number++;
            if (interFaceState.charAt(0) == 'c' || interFaceState.charAt(0) == 'g') {
                decider = new Decider(interFaceState);
                number = 1;
            } else {
                System.out.println("Please re-enter your selection");
                interFaceState = keys.nextLine();
                number = 0;
            }
        }

        if (interFaceState.charAt(0) == 'g') {
            ui = new GUI();

        } else {
            ui = new TerminalUI();

        }

        ui.printToUser("This program is to help you make a decision.\n"
                + "You should enter the choices you have to chose between.\n"
                + "Next enter the  characteristics that distinguish between or are the same. \n"
                + "Lastly rate between this choices and the program will help calculate the answer.\n");


        choicesToDecide = decider.decisionsIn("Please enter your choice");

        characteristics = decider.characteristicsIn("Please enter your characteristics");

        characteristics = decider.characteristicsRanking(characteristics);

        choicesToDecide = decider.characteristicsScoring(characteristics, choicesToDecide);
        
        choicesToDecide = decider.normalizationCharacteristics(characteristics, choicesToDecide);
        
        choicesToDecide = decider.findScore(choicesToDecide);
        ui.printToUser("The choices compare as" + choicesToDecide.toString());


    }//end main
}// end DecisionAssistant

