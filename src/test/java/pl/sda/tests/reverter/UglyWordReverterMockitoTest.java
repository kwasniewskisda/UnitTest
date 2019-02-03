package pl.sda.tests.reverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UglyWordReverterMockitoTest {

    @Mock
    List<String> list;

    @InjectMocks
    UglyWordReverter uglyWordReverter;

    @Test
    public void revertOnlyLetterInWords() {
        //given

        //klasyczne mokowanie wartości na podane wywołąnia
        when(list.size()).thenReturn(5);
        when(list.get(0)).thenReturn("Marcin");
        when(list.get(1)).thenReturn("Ola");
        when(list.get(2)).thenReturn("Marek");
        when(list.get(4)).thenReturn("Karol");

        //when
        uglyWordReverter.revertOnlyLetterInWords();

        //then
        //weyfikujemy czy te metody rzeczywiście zostały wywołane
        verify(list).size();
        verify(list,times(1)).get(0);
        verify(list,times(4)).get(anyInt());
        verify(list,never()).get(3);

    }
}