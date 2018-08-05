package lesson12;

import java.io.File;

public class Task1 {

    public static void main(String[] args) {
        File poem = UtilFiles.getPathToFile("resources", "poem.txt");
        File resultPoem = UtilFiles.getPathToFile("resources", "resultPoem.txt");
        UtilFiles.countInPoemFreqLetter(poem, resultPoem);
    }
}