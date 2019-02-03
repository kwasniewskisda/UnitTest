package pl.sda.tests.calculator.exeptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.tests.calculator.Calculator;
import pl.sda.tests.calculator.CalculatorException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorJupiterTest {

    @Test
    void divide() {
        Calculator calculator = new Calculator();

        CalculatorException calculatorException =
                Assertions.assertThrows(CalculatorException.class,
                        ()-> calculator.divide(5,0));

        assertEquals("Arg should not be 0",calculatorException.getMessage());
    }




}