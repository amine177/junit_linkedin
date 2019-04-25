/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.learn.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author aminos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({self.learn.calculator.MultiplyTest.class, self.learn.calculator.SumTest.class, self.learn.calculator.SubtractTest.class, self.learn.calculator.DivideTest.class, self.learn.calculator.CalculatorTest.class})
public class CalculatorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
