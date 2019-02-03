package pl.sda.tests.reverter;

import lombok.Setter;

import java.util.List;
import java.util.StringJoiner;

public class UglyWordReverter {

    /**
     * Złośliwy odwracacz, nie dośc, że nie odwraca liter, to jeszcze gubi wyrazy
     */
    public String revertOnlyLetterInWords() {
        StringJoiner joiner = new StringJoiner(" ");
        int size = wordsList.size();
        for (int i = 0; i < size; i++) {
            //jeżeli i nie jest zerem oraz reszta z dzielenia przez 3 wynosi 0 to wchodzimy w instrukcje w if
            // czyli zostaje wywołana metoda break, która przerywa bieżącą itereacje.
            //Efekt jest taki, że co 3 wyraz zostaje pomijany.
            if (i != 0 && i % 3 == 0) {
                continue;
            }
            String word = wordsList.get(i);
            joiner.add(word);
        }
        return joiner.toString();
    }

    @Setter
    List<String> wordsList;
}
