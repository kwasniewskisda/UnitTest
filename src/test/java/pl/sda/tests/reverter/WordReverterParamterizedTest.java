package pl.sda.tests.reverter;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class WordReverterParamterizedTest {

    public static WordReverter wordReverter;

    public String word;

    @BeforeClass
    public static void setUp(){
        wordReverter = new WordReverter();
    }

    @Parameterized.Parameters
    public static Iterable parameters()
    {
        return Arrays.asList("Marcin", "Marek","Wiola");
    }

    public WordReverterParamterizedTest(String text) {
        this.word=text;
    }

    @Test
    public void containsLetterATest()
    {
        //given

        //when
        boolean actual = wordReverter.containsLetterA(word);

        //then
        assertTrue(actual);
    }




}
