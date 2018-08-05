package lesson12;

import java.io.*;
import java.util.*;

public class UtilFiles {

    public static File getPathToFile(String pathDirectory, String pathFile) {
        return new File(pathDirectory, pathFile);
    }

    public static File createFile(String pathDirectory, String pathFile) {
        File directory = new File(pathDirectory);
        directory.mkdirs();
        File createFile = new File(directory, pathFile);
        try {
            createFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createFile;
    }

    public static void countInPoemFreqLetter(File poem, File resultPoem) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(poem)));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultPoem))) {
            Map<Character, Integer> lettersMap = new HashMap<>();
            readInFileFrequencyLetter(lettersMap, scanner);
            writeInFile(lettersMap, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInFileFrequencyLetter(Map<Character, Integer> lettersMap, Scanner scanner) {
        while (scanner.hasNextLine()) {
            String stringLine = scanner.nextLine().toLowerCase();
            for (int i = 0; i < stringLine.length(); ++i) {
                char charOne = stringLine.charAt(i);
                if (Character.isLetter(charOne)) {
                    if (lettersMap.containsKey(charOne)) {
                        lettersMap.put(charOne, lettersMap.get(charOne) + 1);
                    } else {
                        lettersMap.put(charOne, 1);
                    }
                }
            }
        }
    }

    public static void writeInFile(Map<Character, Integer> lettersMap, BufferedWriter bufferedWriter) throws IOException {
        for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
            bufferedWriter.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }

    public static void sortedDigitsWriteInFile(File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            List<Integer> integers = new ArrayList<>();
            writeRandomDigits(integers);
            Collections.sort(integers);
            writeDigitsInFile(bufferedWriter, integers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRandomDigits(List<Integer> integers) {
        for (int i = 0; i < 20; i++) {
            integers.add(UtilFiles.getRandomNumberInRange(1, 20));
        }
    }

    public static Integer getRandomNumberInRange(Integer min, Integer max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static void writeDigitsInFile(BufferedWriter bufferedWriter, List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            try {
                bufferedWriter.write(integers.get(i).toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}