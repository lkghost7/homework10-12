package lesson10.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class Util {

    public static List<String> countFrequencyWord(List<String> textList) {
        Integer freq;
        List<String> listWord = new ArrayList<>();
        for (String word : new HashSet<>(textList)) {
            freq = Collections.frequency(textList, word);
            listWord.add(word + " - " + freq);
        }
        return listWord;
    }

    public static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}