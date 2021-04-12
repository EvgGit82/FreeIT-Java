package lesson_8.additionaltasks.Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CensorshipFilter {
    private static String sourceTextAsString;
    private static ArrayList<String> separateSentences = new ArrayList<>();
    private static ArrayList<String> blacklist = new ArrayList<>();
    private static ArrayList<String> sentencesFilteredOut = new ArrayList<>();


    public CensorshipFilter getTextFromFile (String sourceTextPath) {
        StringBuilder textCollector = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceTextPath)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                textCollector.append(string).append(" ");
        }catch (IOException e) {
            System.out.println("File is not found.");
        }

        sourceTextAsString = textCollector.toString();

        return this;
    }

    public CensorshipFilter breakTextIntoSentences () {
        StringTokenizer stringTokenizer = new StringTokenizer(sourceTextAsString, ".?!");

        while (stringTokenizer.hasMoreTokens()){
            separateSentences.add(stringTokenizer.nextToken().trim());
        }

        return this;
    }

    public CensorshipFilter getBlacklistFromFile (String blacklistPath){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(blacklistPath)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                blacklist.add(string.trim());
        }catch (IOException e) {
            System.out.println("File is not found.");
        }

        return this;
    }

    public CensorshipFilter filterBlacklistedWords () {
        for (int i = 0; i < separateSentences.size(); i++) {
            A:    for (String profaneWord : blacklist) {
                if (separateSentences.get(i).contains(profaneWord)){
                    sentencesFilteredOut.add(separateSentences.get(i));
                    break A;
                }
            }
        }
        return this;
    }

    public void printResults () {
        System.out.println("The text " + ((sentencesFilteredOut.size() > 0) ? "didn't pass" : "passed" )
                + " censorship assessment.");

        if (sentencesFilteredOut.size() > 0) {
            System.out.println(sentencesFilteredOut.size() + " sentence(s) contain blacklisted words.");
            System.out.println("The following line(s) shall be modified: ");

            for (String aSentence : sentencesFilteredOut) {
                System.out.println("\"" + aSentence + "\"");
            }
        }
    }

}
