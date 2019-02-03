package pl.sda.tests.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorRuleAnnotationTest {

    private Calculator calculator = new Calculator();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void divideShouldThrowExceptionCauseNullArg() throws CalculatorException {
        //given
        thrown.expect(CalculatorException.class);
        thrown.expectMessage("Arg should not be null");

        //when
        int actual = calculator.divide(5,null);

        //then
        assertEquals(null,actual);
    }

    @Test
    public void divideShouldThrowExceptionCauseZeroArg() throws CalculatorException {
        //given
        thrown.expect(CalculatorException.class);
        thrown.expectMessage("Arg should not be 0");

        //when
        int actual = calculator.divide(5,0);

        //then
        assertEquals(null,actual);
    }
}