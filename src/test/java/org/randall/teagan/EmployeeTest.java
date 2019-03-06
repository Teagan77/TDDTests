package org.randall.teagan;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;

/**
 * Teagan Randall 3b 215095111
 * Unit test for simple Employee Class.
 */

public class EmployeeTest
{
    Employee a = new Employee(111,"Jhon","Davidson");
    Employee b = new Employee(111,"Jhon","Davidson");
    Employee c = a;

    // 1.1 TESTING FOR OBJECT EQUALITY!!!
    @BeforeMethod
    public void setUpEquality(){
    }
    @Test
    public void testEmpEquality()
    {
        // TESTING EQUALITY USING OVERRIDDEN equals() METHOD
        assertEquals("Employee C is a copy of Emplyee A, and will therefore be equal.", true ,a.equals(c));
    }
    @AfterMethod
    public void tearDownEquality(){
    }

    // 1.2 TESTING FOR OBJECT IDENTITY!!!
    @BeforeMethod
    public void setUpIdentity(){
    }
    @Test
    public void testEmpIdentity(){
        assertSame("Two objects of the same type and composition have unique identities." ,true, a.hashCode() != b.hashCode());
    } @AfterMethod
    public void tearDownIdentity(){
    }

    // 1.3 INTENTIONALLY FAILING TEST!!!
    @BeforeMethod
    public void setUpFail(){
    }
    @Ignore // 1.5 DISABLING A TEST (IGNORED TO PREVENT BUILD FAILURE)
    @Test
    public void failingTest(){
        try {
            a.setEmpId(Integer.parseInt("one hundred and twelve"));
        }catch(NumberFormatException e){
            Assert.fail("Test failed due to bad input for employee ID data member.");
        }
    }@AfterMethod
    public void tearDownFail(){
    }

    // 1.4 TEST WITH A TIMEOUT!!! (BOOLEAN IS SET TO TRUE AFTER TIMOUT THROWS AN EXCPETION TO PREVENT BUILD FAILURE)
    @BeforeMethod
    public void setUpTimeOut(){
    }
    @Test(timeout = 100)
    public void testWithTimeout(){
        boolean constant = false;

        try {
            while(constant){
            }
        }catch(Exception e){
            // Setting boolean to true to get test to pass inspite of timing out
            constant = true;

            assertEquals("This test will run for 100 milliseconds, throw an exception and pass.", true, constant);
        }
    }@AfterMethod
    public void tearDownTimeout(){
    }
}


