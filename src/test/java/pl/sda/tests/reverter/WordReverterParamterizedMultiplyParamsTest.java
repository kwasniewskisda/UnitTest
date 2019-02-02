package pl.sda.tests.reverter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

public class WordReverterParamterizedMultiplyParamsTest {

   public WordReverter wordReverter;

    @Parameterized.Parameter
    public String name;
    @Parameterized.Parameter(1)
    public boolean expected;

   @Before
    public void setup(){
       wordReverter= new WordReverter();
   }

   @Parameterized.Parameters(name = "{0} has a should be {1}")
    public static Collection<Object[]> data(){
       return Arrays.asList(
               new Object[][]{
                       {"marcin",true},
                       {"Agnieszka", true},
                       {"Nowy",false}
               }
       );
   }

   @Test public void containsLetterATest()
   {
       //given

       //when
       boolean actual = wordReverter.containsLetterA(name);

       //then
       assertEquals(expected,actual);
   }

}
