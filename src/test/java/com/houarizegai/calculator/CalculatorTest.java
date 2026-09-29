package com.houarizegai.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        double result = Calculator.calculate(5, "3", "+");
        Assert.assertEquals(result, 8.0);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.calculate(10, "4", "-");
        Assert.assertEquals(result, 6.0);
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.calculate(6, "7", "*");
        Assert.assertEquals(result, 42.0);
    }

    @Test
    public void testDivision() {
        double result = Calculator.calculate(20, "5", "/");
        Assert.assertEquals(result, 4.0);
    }

    @Test
    public void testPower() {
        double result = Calculator.calculate(2, "3", "^");
        Assert.assertEquals(result, 8.0);
    }
}
