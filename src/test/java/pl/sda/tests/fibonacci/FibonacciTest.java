package pl.sda.tests.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameter
    public int number;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters(name = "{0} parameter should be {1}")
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {4,3},
                        {11,89},
                        {19,4181}
                }
        );
    }

    @Test()
    public void computeTest(){
        //given
        Fibonacci fibonacci = new Fibonacci();

        //when
        long actual = fibonacci.compute(number);

        //then
        assertEquals(expected,actual);
    }
}