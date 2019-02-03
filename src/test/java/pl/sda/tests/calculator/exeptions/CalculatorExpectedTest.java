package pl.sda.tests.calculator.exeptions;

import org.junit.Test;
import pl.sda.tests.calculator.Calculator;
import pl.sda.tests.calculator.CalculatorException;

import static org.junit.Assert.*;

public class CalculatorExpectedTest {

    Calculator calculator = new Calculator();

    @Test(expected = CalculatorException.class)
    public void divideTest() throws CalculatorException {
        //then
            calculator.divide(5,0);
    }
}