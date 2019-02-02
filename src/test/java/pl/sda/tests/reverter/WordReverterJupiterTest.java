package pl.sda.tests.reverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordReverterJupiterTest {

    @ParameterizedTest(name = "{0} contains A")
    @ValueSource(strings = {"Marcin", "Alina", "Marek"})
    void containsLetterATest(String word) {
        //given
        WordReverter wordReverter = new WordReverter();

        //when
        boolean actual = wordReverter.containsLetterA(word);

        //then
        assertEquals(true, actual);
    }

    @ParameterizedTest()
    @MethodSource("getArgumentsForRevertTest")
    public void revertTest(String word, String expected) {
        //given
        WordReverter wordReverter = new WordReverter();

        //when
        String actual = wordReverter.revert(word);

        //then
        Assertions.assertEquals(expected,actual);

    }

    public static Stream<Arguments> getArgumentsForRevertTest(){
        return Stream.of(
                Arguments.of("Marcin","nicraM"),
                Arguments.of("Ola","alO"),
                Arguments.of("Marek","keraM"));

    }

}