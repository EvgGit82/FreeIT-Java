package lesson_8.additionaltasks.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PalindromeFilter {

    private List<String> wordsFormFile = new ArrayList<>();
    private List<String> filteredPalindromes = new ArrayList<>();

    public PalindromeFilter readLinesFromFile (String sourceFilePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                wordsFormFile.add(string.trim());
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
        return this;
    }

    public PalindromeFilter filterWordsList (){
        for (String aWord : wordsFormFile) {
            if (isPalindrome(aWord)){
                filteredPalindromes.add(aWord);
            }
        }
        return this;
    }

    private static boolean isPalindrome (String wordToCheck) {
        return wordToCheck.toLowerCase().equals(new StringBuilder(wordToCheck.toLowerCase()).reverse().toString());
    }


    public PalindromeFilter writeLinesToFile (String targetFilePath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFilePath)))
        {
            bufferedWriter.write("PALINDROMES FILTERED FROM THE SOURCE FILE: ");
            bufferedWriter.newLine();

            for (String aPalindrome : filteredPalindromes) {
                bufferedWriter.write(aPalindrome);
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            System.out.println("Writing to file failed.");
        }
        return this;
    }

}
