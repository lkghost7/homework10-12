package lesson12;

import java.io.File;

public class Task2 {

    public static void main(String[] args) {
        File resultDigits = UtilFiles.createFile("resources", "resultDigits.txt");
        UtilFiles.sortedDigitsWriteInFile(resultDigits);
    }
}