/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott Dykstra
 * @version 10-23-2012
 */
public interface UI {
    
   /**
     * Print to text information to the user.
     *
     * @param info inform user of program response.
     */
     public void printToUser(String print);
     

     /**
     * Inform user and ask for answer to new question question
     *
     * @param send message to ask the user for input
     * @return string entered by user
     */
     public String question(String input);
     /**
     * Ask the user to respond with YES or NO.
     * @param message for user to answer question.
     * @return true if user selects YES, false otherwise
     */
    public boolean ChooseYesOrNo(String question) ;
     
    
    /**
     * Ask the user for a number value to rate the choice.
     * @param question to ask user.
     * @return int value
     */
    public int userCompare(String question);
}