/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleassertions;

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
public class SampleAssertionsTest {
    
    public SampleAssertionsTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }
    
    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
    }
    
    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be the same", new Object(), new Object());
    }
    
    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }
    
    @Test 
    public void testAssertSame() {
        Integer sampleNumber = Integer.valueOf(42);
        assertSame("failure - should be the same", sampleNumber, sampleNumber);
    }
    
    @Test
    public void testAssertTrue() {
        assertTrue("failure - should be true", false);
    }
}
