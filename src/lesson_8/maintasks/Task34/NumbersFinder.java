package lesson_8.maintasks.Task34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class NumbersFinder {

    private final ArrayList <Integer> numbersList = new ArrayList<>();
    private LinkedHashSet <Integer> nonRepeatingNumbersSet;
    private String wholeText;


    public void readFile(String fileUrl) {

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUrl)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                stringBuilder.append(string).append(" ");
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
        wholeText = stringBuilder.toString();
    }

    public void getNumbersAndNonRepeatingNumbers() {

        ArrayList<String> everyWordList = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(wholeText.trim(), " ,;.:!?{}[]()");

        while (stringTokenizer.hasMoreTokens()) {
            everyWordList.add(stringTokenizer.nextToken());
        }

        for (String string : everyWordList) {
            if (string.matches("\\d+")) {
                numbersList.add(Integer.parseInt(string));
            }
        }
        nonRepeatingNumbersSet = new LinkedHashSet<>(numbersList);
    }

    public int sumAllNumbers() {

        int totalSum = 0;

        for (Integer integer : numbersList) {
            totalSum += integer;
        }
        return totalSum;
    }

    public void printResults() {
        System.out.println("Numbers from the text: " + numbersList.toString());
        System.out.println("The total sum of numbers in the text makes: " + sumAllNumbers());
        System.out.println("Delete repeating numbers and print them out again: " + nonRepeatingNumbersSet.toString());
    }
}
