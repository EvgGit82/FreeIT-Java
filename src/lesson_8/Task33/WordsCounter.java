package lesson_8.Task33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordsCounter {

    private String wholeText;

    public void readFile(String fileUrl){

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUrl)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                stringBuilder.append(string).append(" ");
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
        wholeText = stringBuilder.toString();
    }

    private int getTotalWordsCount() {

        int totalWordsCount = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(wholeText.trim(), " ,;.:!?{}[]()");

        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            totalWordsCount++;
        }
        return totalWordsCount;
    }

    private int getTotalPunctuationMarks (){

        int charsCounter = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(wholeText.trim(), ",;.:!?{}[]()");

        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            charsCounter++;
        }
        return charsCounter;
    }

    public void printResults() {
        System.out.println("The text contains " + getTotalPunctuationMarks() + " punctuation marks.");
        System.out.println("The text contains " + getTotalWordsCount() + " words.");
    }
}
