package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void addTest(){
        int result = Calculator.add(2,5);
        int expectResult = 7;

        Assertions.assertEquals(expectResult,result,"Test Case failed");
    }

    @Test
    public void subtractTest(){
        int result = Calculator.subtract(2,5);
        int expectResult = -3;

        Assertions.assertEquals(expectResult,result,"Test Case failed");
    }

    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(2,5);
        int expectResult = 10;

        Assertions.assertEquals(expectResult,result,"Test Case failed");
    }

    @Test
    public void divideTest() {
        // Case 1: Normal Division
        int result = Calculator.divide(2, 5);
        int expectResult = 0;
        Assertions.assertEquals(expectResult, result, "Test Case failed for normal division");
    }

    @Test
    public void divideByZeroTest() {
        // Case 2: Division by Zero should throw ArithmeticException
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(2, 0);
        }, "Expected ArithmeticException when dividing by zero");
    }
}
