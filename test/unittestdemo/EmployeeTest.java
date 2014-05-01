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
public class EmployeeTest {
    private Employee employee;
    public EmployeeTest() {
    }

    @Before
    public void setUp() {
        employee = new Employee();
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLastNameNotNull() {
        employee.setLastName(null);
    }
     @Test(expected = IllegalArgumentException.class)
    public void testSetLastNameNotEmpty() {
        employee.setLastName("");
    }
     @Test
    public void testSetLastNameNotWithinRange() {
        String[] badData = {
          "x", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            "!@#$%^&*()_+=~`:;?/|><.,"
        };
        for(String s : badData){
            try{
                employee.setLastName(s);
                fail();
            }catch(IllegalArgumentException ia){
                //all OK
            }
        }
    }
     public void testSetLastNameWithinRange() {
        String[] goodData = {
          "xx", "Smith", "Smith-Larson", "Smith Larson", "VeryVeryVeryLongSmith",
            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
        };
        for(String s : goodData){
            try{
                employee.setLastName(s);
            }catch(IllegalArgumentException ia){
                fail();
            }
        }
    }
}
