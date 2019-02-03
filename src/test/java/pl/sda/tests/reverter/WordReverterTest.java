package  pl.sda.tests.reverter;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class WordReverterTest {

    public WordReverter wordReverter;

    @Test
    public void revertTest(){
        //given
        wordReverter = new WordReverter();

        //when
        String actual = wordReverter.revert("Marcin");

        //then
        String expected = "nicraM";
        assertThat(actual).isEqualTo(expected);

        String expectSmallLetters = "nicram";
        assertThat(actual).isEqualToIgnoringCase(expectSmallLetters);
    }
}
