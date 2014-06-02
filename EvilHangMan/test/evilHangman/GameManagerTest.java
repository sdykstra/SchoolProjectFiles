/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evilHangman;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author FT
 */
public class GameManagerTest {
    
    public GameManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class GameManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EvilHangmanGameManager.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class GameManager.
     */
    @Test
    public void testPrepare() {
        System.out.println("prepare");
        EvilHangmanGameManager.prepare();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doFrame method, of class GameManager.
     */
    @Test
    public void testDoFrame() {
        System.out.println("doFrame");
        EvilHangmanGameManager.doFrame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
