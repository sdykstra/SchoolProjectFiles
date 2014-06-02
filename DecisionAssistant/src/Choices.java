
import java.util.ArrayList;

/**
 *
 * @author Scott Dykstra
 * @version 11-7-2012
 */
public class Choices {

    public String choice;
    public ArrayList<String> decision;
    public ArrayList<QuestionScore> questionScore;
    public QuestionScore qs;
    public double finalScore;
    public Choices(String c) {
        choice = c;
        questionScore = new ArrayList<QuestionScore>();
        finalScore =0;
    }//end DecisionAssisant

    public void addQuestion(String question, int num) {
        questionScore.add(num, qs = new QuestionScore(question));
        
       
    }//end addQuestion

    public void SetScore(int scoreIn, int num) {
        qs = questionScore.get(num);
        qs.setScore(scoreIn);
        questionScore.set(num, qs);
    }// end SetScore

    
    public double getScore(int num){
        return questionScore.get(num).getScore();
    }
    
    public String toString() {

        return "[ " + choice + "  " 
                + (int)finalScore + " ]";
    }
    
    public void setFinalScore(double num){
        finalScore =num;
    }
}// end Choices