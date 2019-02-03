package pl.sda.tests.reverter.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.sda.tests.reverter.WordReverter;

import static org.junit.jupiter.api.Assertions.*;

class WordReverterJupiterTest {

    WordReverter wordReverter = new WordReverter();

    @Test
    @DisplayName("Should throws Null Pointer Exception.")
    void containsLetterATest() {
        Assertions.assertThrows(
                NullPointerException.class,()->wordReverter.containsLetterA(null)
        );
    }
}