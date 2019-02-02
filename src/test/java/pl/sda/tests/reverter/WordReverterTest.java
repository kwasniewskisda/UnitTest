package  pl.sda.tests.reverter;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordReverterTest {

    public WordReverter wordReverter;

    @Test
    public void revertTest(){
        //given
        wordReverter = new WordReverter();

        //when
        String actual = wordReverter.revert("Marcin");

        //then
        assertEquals("nicraM",actual);
    }
}
