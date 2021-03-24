/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class InsuranceTest {
    
    public InsuranceTest() {
    }

    @Test
    public void testCalculateInsurance() throws InvalidAgeException {
        System.out.println("calculateInsurance");
        int age = 35;
        int expResult = 475;
        int result = Insurance.calculateInsurance(age);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateInsuranceException1() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Insurance.calculateInsurance(4);
        });
    }
    
    @Test
    public void testCalculateInsuranceException2() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Insurance.calculateInsurance(164);
        });
    }
}
