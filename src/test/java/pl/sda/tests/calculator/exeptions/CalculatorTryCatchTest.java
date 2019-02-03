package pl.sda.tests.calculator.exeptions;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.tests.calculator.Calculator;
import pl.sda.tests.calculator.CalculatorException;

import static org.junit.Assert.*;

public class CalculatorTryCatchTest {

    Calculator calculator = new Calculator();

    @Test
    public void divide() {
        try {
            calculator.divide(5,0);
            fail("This method should Throw CalculatorException");
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }
}