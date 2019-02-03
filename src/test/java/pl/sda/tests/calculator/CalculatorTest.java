package pl.sda.tests.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addingTest() {
        //given
        Calculator calculator = new Calculator();

        //when
        int actual = calculator.add(5,3);

        //then
        assertNotNull(actual);
        assertEquals(8,actual);
    }

    @Test
    public void substractingTest() {
        //given
        Calculator calculator = new Calculator();

        //when
        int actual = calculator.substract(10,3);

        //then
        assertEquals(7,actual);
    }

    @Test
    public void dividingTest() throws CalculatorException {
        //given
        Calculator calculator = new Calculator();

        //when
        int actual = calculator.divide(12,3);

        //then
        assertEquals(4,actual);
    }






}