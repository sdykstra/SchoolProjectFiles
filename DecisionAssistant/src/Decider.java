
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Scott Dykstra
 * @version 11-14-2012
 */
public class Decider {

    public Choices newChoice;
    public UI interfaceUi;

    public Decider(String string) {
        if (string.charAt(0) == ('g')) {
            interfaceUi = new GUI();
        } else {
            interfaceUi = new TerminalUI();
        }
    }

    /**
     * This method takes the input for the choices and puts them into a new
     * ArrayList then returns the array
     *
     * @param choices
     * @return ArrayList
     */
    public ArrayList decisionsIn(String choices) {
        ArrayList<Choices> temp = new ArrayList<Choices>();

        boolean done = false;

        do {
            String problemChoice = interfaceUi.question(choices
                    + " to decide on or '*' when done");

            if (!problemChoice.equals("*")) {
                temp.add(new Choices(problemChoice));
                done = false;
            } else {
                done = true;
            }
        } while (!done);

        return temp;
    }// end choicesIn

    /**
     * This method takes the input for the characteristics of the choices and
     * puts them into a new ArrayList then returns the array
     *
     * @param characteristics
     * @return ArrayList
     */
    public ArrayList characteristicsIn(String characteristics) {
        ArrayList<QuestionScore> temp = new ArrayList<QuestionScore>();

        boolean done = false;

        do {
            String characteristicsChoice = interfaceUi.question(characteristics
                    + " to decide on or '*' when done");

            if (!characteristicsChoice.equals("*")) {
                temp.add(new QuestionScore(characteristicsChoice));
                done = false;
            } else {
                done = true;
            }
        } while (!done);

        return temp;

    }//end characteristicsIn

    /**
     * Method to establish the raking of the items between each choice
     *
     * @param characteristics
     * @param choices
     */
    public ArrayList characteristicsRanking(ArrayList<QuestionScore> characteristics) {

        int Standard = 10;

        QuestionScore temp1 = characteristics.get(0);
        
        for (int k = 1; k < characteristics.size(); k++) {
int num = interfaceUi.userCompare("If the deciding characteristics is \n"
                        + characteristics.get(k).getQuestion()
                        + ". What would " + temp1.getQuestion() +" be rate out of 100?");
            
  temp1.setScore(num);
           
            QuestionScore temp2 = characteristics.get(k);
            int num2;

            num2 = interfaceUi.userCompare("We have to compare the values of all"
                    + " characteristics against each other.\n If "
                    + temp1.getQuestion() + " is a "+ temp1.getScore() +". \n What is "
                    + temp2.getQuestion() + " rated ?");

            temp2.setScore(num2);
            characteristics.set(k, temp2);

        }
 
        characteristics.set(0, temp1);


        return characteristics;
    }//end characteristicsRanking

    public ArrayList characteristicsScoring(ArrayList<QuestionScore> characteristics,
            ArrayList<Choices> choices) {


        // this set of loops establish the raking of the items between each problem
        for (int i = 0; i < characteristics.size(); i++) {
           
            int Standard = 10;

            Choices temp1 = choices.get(0);


           
            for (int k = 1; k < choices.size(); k++) {

                Choices temp2 = choices.get(k);
                int num;

                num = interfaceUi.userCompare("If deciding characteristics is \n ("
                        + characteristics.get(i).getQuestion()
                        + ") and if " + temp1.choice + " is a  ten.\n "
                        + "What is " + temp2.choice + " rated ?");

                temp2.addQuestion(characteristics.get(i).getQuestion(), i);
                temp2.SetScore(num, i);
                choices.set(k, temp2);

            }

            temp1.addQuestion(characteristics.get(i).getQuestion(), i);
            temp1.SetScore(Standard, i);
            choices.set(0, temp1);

        }// end for loop for problem scoring 
        return choices;
    }//end characteristicsScoring

    public ArrayList normalizationCharacteristics(ArrayList<QuestionScore> characteristics,
            ArrayList<Choices> choices) {
        // loop for normalization of the characteristics
        for (int i = 0; i < characteristics.size(); i++) {
            double tempQuestion = characteristics.get(i).getScore();
            int total = 0;
            for (int k = 0; k < choices.size(); k++) {
                total += choices.get(k).questionScore.get(i).getScore();
            }// end get total scores

            for (int k = 0; k < choices.size(); k++) {
                double score = choices.get(k).questionScore.get(i).getScore();
                score /= total;
                score *= tempQuestion;
                choices.get(k).questionScore.get(i).setScore(score);

            }// end choices normalization loop
        }// end normalization of characteristics for loop.
        return choices;
    }//end normalizationCharacteristics

    public ArrayList findScore(ArrayList<Choices> choices) {
        // this for loop finds the score for each choice
        for (int j = 0; j < choices.size(); j++) {

            Choices temp = choices.get(j);
            double total = 0;
            for (int m = 0; m < temp.questionScore.size(); m++) {
                total += temp.questionScore.get(m).getScore();
            }

            temp.setFinalScore(total);
        }


        double bigScore = 0;
        for (int n = 0; n < choices.size(); n++) {

            double temp2 = choices.get(n).finalScore;

            if (bigScore < temp2) {
                bigScore = temp2;
            }
        }

        for (int n = 0; n < choices.size(); n++) {
            double temp1 = 0;
            double temp2 = 0;

            temp1 = choices.get(n).finalScore;

            temp2 = temp1 / bigScore;
            temp1 = temp2 * 100;
            choices.get(n).setFinalScore((int)temp1);

        }
        return choices;
    }//end findScore
}// end Decider
