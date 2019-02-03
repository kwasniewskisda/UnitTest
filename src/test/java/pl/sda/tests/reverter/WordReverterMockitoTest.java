package pl.sda.tests.reverter;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WordReverterMockitoTest {

    @Mock
    WordReverter wordReverter;

    @Test
    public void revert() {
        //given
        String expected = "nicraM";
        when(wordReverter.revert(anyString())).thenReturn(expected);

        //when
        String actual = wordReverter.revert("Marcin");

        assertEquals(expected,actual);
    }

    @Test
    @Ignore
    public void containsLetterATest() {
        //given
        // Nie można łączyć matcherów (anyString()) z konkretnymi wartościami
        when(wordReverter.containsLetterA(anyString(),"Ola")).thenReturn(true);

        //when
        boolean actual = wordReverter.containsLetterA("Marcin","Ola");

        assertEquals(true,actual);
    }
}