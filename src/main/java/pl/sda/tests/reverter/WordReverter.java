package pl.sda.tests.reverter;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class WordReverter {

    public String revert(String value) {
        StringBuffer stringBuffer = new StringBuffer(value);
        return stringBuffer.reverse().toString();
    }

    public boolean containsLetterA(String text) {
        return text.contains("a");
    }

    public boolean containsLetterA(String text, String text2) {
        return text.contains("a") || text2.contains("a");
    }

    public String revertOnlyLetterInWords(String value) {
        List<String> wordsList = Arrays.asList(value.split(("\\s+")));
        List<String> wordsListRev = wordsList.stream().map(n -> revert(n)).collect(Collectors.toList());
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : wordsListRev) {
            joiner.add(word);
        }
        return joiner.toString();
    }

}
