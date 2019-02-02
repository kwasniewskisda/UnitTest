package pl.sda.tests.fibonacci;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FibonacciJupiterTest {

    public Fibonacci fibonacci = new Fibonacci();

    @DisplayName("Computing")
    @ParameterizedTest(name = "{0} argument of Fibonacci should be {1}")
    @MethodSource("getArguments")
    public void computeTest(int number, int excpected){
        //given

        //when
        long actual = fibonacci.compute(number);

        //then
        Assertions.assertEquals(excpected,actual);
    }

    public static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of(4,3),
                Arguments.of(14,377),
                Arguments.of(17,1597));

    }

}