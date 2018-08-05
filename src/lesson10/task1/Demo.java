package lesson10.task1;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        String text = "Lets you jump to any table view, or procedure by its name " +
                "via corresponding action or directly from its usages in the SQL code";
        List<String> textParsing = Arrays.asList(text.split(" "));
        Util.printList(Util.countFrequencyWord(textParsing));
    }
}