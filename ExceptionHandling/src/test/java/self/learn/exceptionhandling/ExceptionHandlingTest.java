/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.learn.exceptionhandling;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aminos
 */
public class ExceptionHandlingTest {
    
    public ExceptionHandlingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ExceptionHandling.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ExceptionHandling.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundException() {
        new ArrayList().get(5);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testZeroDivisionException() {
        int name = 10 / 0;
    }
}
