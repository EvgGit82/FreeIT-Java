package lesson_7.Task32.engine;

import java.util.*;

public class Dictionary {

    private final ArrayList <String> separateWords = new ArrayList<>();
    private final HashMap<String, Integer> unsortedFrequencyDictionary = new HashMap<>();
    private final LinkedHashMap<String, Integer> frequencyDictionary = new LinkedHashMap<>();


    public Dictionary getSeparateWords(String originalText) {
        StringTokenizer stringTokenizer = new StringTokenizer(originalText.trim(), " -,;.:!?{}[]()\"\n");

        while (stringTokenizer.hasMoreTokens()){
            separateWords.add(stringTokenizer.nextToken().toLowerCase());
        }
        return this;
    }


    public Dictionary buildFrequencyDictionary() {
        ArrayList <String> uniqueWordsList = new ArrayList<>(new LinkedHashSet<>(separateWords));

        for (String aWord : uniqueWordsList) {
            unsortedFrequencyDictionary.put(aWord, getWordRepetitions(aWord));
        }
        return this;
    }


    private Integer getWordRepetitions(String wordToCount) {
        int repetitionsCount = 0;

        for (String separateWord : separateWords) {
            if (separateWord.equals(wordToCount)) {
                repetitionsCount++;
            }
        }
        return repetitionsCount;
    }


    public Dictionary sortFrequencyDictionary() {
        List<Map.Entry<String, Integer>> sortingList = new ArrayList<>(unsortedFrequencyDictionary.entrySet());
        sortingList.sort(Map.Entry.comparingByValue());
        Collections.reverse(sortingList);

        for (Map.Entry<String, Integer> entry : sortingList) {
            frequencyDictionary.put(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void printFrequencyDictionary(){
        for (Map.Entry<String, Integer> pair : frequencyDictionary.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\" repeats " + pair.getValue() + " time(s)");
        }
    }
}