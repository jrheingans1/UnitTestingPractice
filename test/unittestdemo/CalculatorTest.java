/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrheingans1
 */
public class CalculatorTest {
    private Calculator calc;
    
    public CalculatorTest() {
    }

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testSquare() {
        int input = 4;
        int expected = 16;
        
        int actual = calc.square(input);
        assertEquals(expected, actual);
    }
}
