package pl.sda.tests.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockitoTest {

    @Mock
    public Calculator calculator;

    @Test
    public void getValueHigherThanHundredMockTest(){
        //given
        when(calculator.getValueHigherThanHundred()).thenReturn(500);

        //when
        int actual = calculator.getValueHigherThanHundred();

        //then
        assertEquals(500,actual);
    }

}