package lesson_8.additionaltasks.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TextFormatterRunner {

    private static final String SOURCE_TEXT_PATH = "src/lesson_8/additionaltasks/Task2/sourceText.txt";
    private static final String TARGET_TEXT_PATH = "src/lesson_8/additionaltasks/Task2/targetText.txt";
    private static String textAsString;
    private static ArrayList<String> separateSentences = new ArrayList<>();
    private static ArrayList<String> filteredSentences = new ArrayList<>();

    public static void main(String[] args) {

        TextFormatter textFormatter = new TextFormatter();

        textAsString = getTextFromFile() ;
        breakTextIntoSentences();
        separateSentences.remove(separateSentences.size()-1);

        for (String aSentence : separateSentences) {
            if (textFormatter.checkSentenceLength(aSentence)){
                filteredSentences.add(aSentence);
            }
        }

        writeTextToFile();

    }

    private static String getTextFromFile () {
        StringBuilder textCollector = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(SOURCE_TEXT_PATH)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                textCollector.append(string).append(" ");
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
        return textCollector.toString();
    }

    private static void breakTextIntoSentences () {
        StringTokenizer stringTokenizer = new StringTokenizer(textAsString, ".");

        while (stringTokenizer.hasMoreTokens()){
            separateSentences.add(stringTokenizer.nextToken().trim() + ".");
        }
    }

    private static void writeTextToFile () {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(TARGET_TEXT_PATH)))
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
