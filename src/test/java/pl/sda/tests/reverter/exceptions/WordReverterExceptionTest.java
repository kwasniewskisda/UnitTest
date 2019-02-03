package pl.sda.tests.reverter.exceptions;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;
import pl.sda.tests.reverter.WordReverter;

import static org.junit.Assert.*;

public class WordReverterExceptionTest {

    WordReverter wordReverter = new WordReverter();

    @Test(expected = NullPointerException.class)
    public void containsLetterAExpectedTest() {
        wordReverter.containsLetterA(null);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void containsLetterARuleTest() {
        thrown.expect(NullPointerException.class);

        Boolean actual = wordReverter.containsLetterA(null);

        assertEquals(null,actual);

    }
}