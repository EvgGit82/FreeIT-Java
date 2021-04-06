package lesson_7.Task32;

import java.util.*;

public class DictionaryBuilder {

    private final ArrayList <String> separateWords = new ArrayList<>();
    private final HashMap<String, Integer> unsortedFrequencyDictionary = new HashMap<>();
    private final LinkedHashMap<String, Integer> frequencyDictionary = new LinkedHashMap<>();


    public DictionaryBuilder getSeparateWords(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), " -,;.:!?{}[]()\"\n");

        while (stringTokenizer.hasMoreTokens()){
            separateWords.add(stringTokenizer.nextToken().toLowerCase());
        }
        return this;
    }


    public DictionaryBuilder buildFrequencyDictionary() {
        ArrayList <String> uniqueWordsList = new ArrayList<>(new LinkedHashSet<>(separateWords));

        for (String string : uniqueWordsList) {
            unsortedFrequencyDictionary.put(string, getWordRepetitions(string, separateWords));
        }
        return this;
    }


    private Integer getWordRepetitions(String string, ArrayList<String> separateWords) {
        int repetitionsCount = 0;

        for (String separateWord : separateWords) {
            if (separateWord.equals(string)) {
                repetitionsCount++;
            }
        }
        return repetitionsCount;
    }


    public DictionaryBuilder sortFrequencyDictionary() {
        List<Map.Entry<String, Integer>> sortingList = new ArrayList<>(unsortedFrequencyDictionary.entrySet());
        sortingList.sort(Map.Entry.comparingByValue());
        Collections.reverse(sortingList);

        for (Map.Entry<String, Integer> entry : sortingList) {
            frequencyDictionary.put(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void printSortedDictionary (){
        for (Map.Entry<String, Integer> pair : frequencyDictionary.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\" repeats " + pair.getValue() + " time(s)");
        }
    }
}