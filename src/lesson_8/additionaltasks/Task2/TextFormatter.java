package lesson_8.additionaltasks.Task2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TextFormatter {

    private ArrayList<String> wordList = new ArrayList<>();

    public boolean checkSentenceLength (String sentenceToAnalyze) {
        wordList.clear();
        getWordList(sentenceToAnalyze);
        return wordList.size() < 6;
    }

    public boolean checkForPalindromes (String sentenceToAnalyze) {
        wordList.clear();
        getWordList(sentenceToAnalyze);

        for (String aWord : wordList) {
            if (aWord.toLowerCase().equals(new StringBuilder(aWord.toLowerCase()).reverse().toString())) {
                return true;
            }
        }
        return false;
    }

    private void getWordList (String sentenceToAnalyze) {
        StringTokenizer stringTokenizer = new StringTokenizer(sentenceToAnalyze.trim(), " -,;.:!?{}[]()\"");

        while (stringTokenizer.hasMoreTokens()){
            wordList.add(stringTokenizer.nextToken());
        }
    }

}
