
/**
 *
 * @author Scott Dykstra
 * @version 11-07-2012
 */
public class QuestionScore {

    private String question;
    private double score;

    public QuestionScore() {
        question = null;
        score = 0;
    }

    public QuestionScore(String q) {
        question = q;
        score = 0;
    }

    public void setScore(double s) {
        score = s;
    }

    public String getQuestion() {
        return question;
    }

    public double getScore() {
        return score;
    }
    
    public String toString(){
        return question +"," + score;
    }
    
}




