
import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author Scott Dykstra
 */
public class DeciderTest extends TestCase {

    public static ArrayList<Choices> choiceArray = new ArrayList<Choices>(3);
    public static ArrayList<QuestionScore> questionArray = new ArrayList<QuestionScore>(2);

    public DeciderTest(String testName) {
        super(testName);
    }

    @BeforeClass
    protected static void setUpClass() throws Exception {

        choiceArray.add(new Choices("dog"));
        choiceArray.add(new Choices("cat"));
        choiceArray.add(new Choices("bird"));

        questionArray.add(new QuestionScore("playfulness"));
        questionArray.add(new QuestionScore("appearance"));



    }

    @Before
    protected void setUp() throws Exception {
    }

    @After
    protected void tearDown() throws Exception {
    }

    /**
     * Test of decisionsIn method, of class Decider.
     */
    @Test
    public void testDecisionsIn(ArrayList choicesArray) {
        System.out.println("decisionsIn");
        String choices = null;
        Decider instance = null;
        ArrayList<Choices> result = new ArrayList<Choices>();
        ArrayList<Choices> expResult = choiceArray;
        for (int i = 0; i <= 3; i++) {
            if (i < 3) {
                choices = choiceArray.get(i).choice;
            } else {
                choices = "*";
            }

            result = instance.decisionsIn(choices);
        }
        assertEquals(expResult, result);

        fail("The decisionsIn did not add the choices correctly");
    }

    @Test
    public void testNormalizationCharacteristics() {
        Choices temp = null;
        temp = choiceArray.get(0);
        temp.addQuestion("playfulness", 0);
        temp.SetScore(10, 0);
        temp.addQuestion("appearance", 1);
        temp.SetScore(10, 0);
        choiceArray.set(0, temp);

        temp = choiceArray.get(1);
        temp.addQuestion("playfulness", 0);
        temp.SetScore(7, 0);
        temp.addQuestion("appearance", 1);
        temp.SetScore(15, 1);
        choiceArray.set(1, temp);

        temp = choiceArray.get(2);
        temp.addQuestion("playfulness", 0);
        temp.SetScore(7, 0);
        temp.addQuestion("appearance", 1);
        temp.SetScore(15, 1);
        choiceArray.set(2, temp);
        System.out.println("normalizationCharacteristics");
        ArrayList<QuestionScore> characteristics = null;
        ArrayList<Choices> choices = choiceArray;
        Decider instance = null;
        
        ArrayList<Choices> expResult = choiceArray;
       

        QuestionScore tempQ = null;
        tempQ = questionArray.get(0);
        tempQ.setScore(30);
        questionArray.set(0, tempQ);
        tempQ = questionArray.get(1);
        tempQ.setScore(4);
        questionArray.set(1, tempQ);


        ArrayList result = instance.normalizationCharacteristics(characteristics, choices);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findScore method, of class Decider.
     */
    @Test
    public void testFindScore() {
        
        
        System.out.println("findScore");
        int choicesNum = 0;
        ArrayList<Choices> choices = null;
        Decider instance = null;
        ArrayList expResult = null;
         Choices tempC = null;
        tempC = new Choices("dog");
        tempC.setFinalScore(100);
        expResult.set(0, tempC);

        tempC = new Choices("cat");
        tempC.setFinalScore(74);
        expResult.set(1, tempC);

        tempC = new Choices("bird");
        tempC.setFinalScore(62);
        expResult.set(2, tempC);
        
        ArrayList result = instance.findScore(choices);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}