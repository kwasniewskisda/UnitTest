package pl.sda.tests.assertions;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void ListAssertsTest() {
        //given
        List<String> list = Arrays.asList(
                "Barłomiej", "Dominik", "Eligiusz", "Kacper", "Marcin");

        //when

        //then
        assertThat(list).contains("Barłomiej");
        assertThat(list).hasSize(5);
        assertThat(list).doesNotContain("Ania");
    }

    @Test
    public void DateAssertsTest() {
        LocalDate now = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);

        assertThat(now).isAfter(yesterday);
    }
}
