package lesson_8.additionaltasks.Task2.utils;

import java.io.*;
import java.util.List;

public class FileHandler {

    public String readTextFromFile(String sourceTextFile) {
        StringBuilder textCollector = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceTextFile)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                textCollector.append(string).append(" ");
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
        return textCollector.toString();
    }

    public void writeTextToFile (String targetFilePath, List<String> filteredSentences) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFilePath)))
        {
            bufferedWriter.write("SENTENCES BELOW 6 WORDS FROM THE SOURCE FILE CONTAINING PALINDROMES: ");
            bufferedWriter.newLine();

            for (String aPalindrome : filteredSentences) {
                bufferedWriter.write(aPalindrome);
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            System.out.println("Writing to file failed.");
        }
    }

}
