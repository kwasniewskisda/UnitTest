package pl.sda.tests.reverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class WordReverterRevertOnlyLetterInWordsTest {

    WordReverter wordReverter = new WordReverter();

    @Parameterized.Parameter
    public String text;

    @Parameterized.Parameter(1)
    public String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {"Ola ma kota", "alO am atok"}
                }
                );
    }

    @Test
    public void revertOnlyLetterInWords() {
        //given

        //when
        String actual = wordReverter.revertOnlyLetterInWords(text);

        assertEquals(expected,actual);
    }
}