package pl.sda.tests.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockitoDependencyTest {

    @InjectMocks
    public Calculator calculator;

    @Mock
    public HighValueProvider valueProvider;

    @Test
    public void getValueHigherThanHundredMockDependencyTest(){
        //given
        when(valueProvider.getHighValue()).thenReturn(500);

        //when
        int actual = calculator.getValueHigherThanHundred();

        //then
        assertEquals(1000,actual);
    }



}