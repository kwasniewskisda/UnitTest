package pl.sda.tests.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTDDTest {

    Calculator calculator = new Calculator();

    @Test
    public void isEvenTest(){
        //given

        //when
        boolean actual = calculator.isEvenValue(4);

        assertEquals(true,actual);
    }

    @Test
    public void isNotEvenTest(){
        //given

        //when
        boolean actual = calculator.isEvenValue(3);

        assertEquals(false,actual);
    }

    @Test
    public void isSquareValueTest(){
        //given

        //when
        int actual = calculator.getSquareValue(4);

        assertEquals(16,actual);
    }

    @Test
    public void calculateBruttoValueTest(){
        //given

        //when
        double actual = calculator.calculateBruttoValue(100);

        assertEquals(120,actual,0.5);
    }

}