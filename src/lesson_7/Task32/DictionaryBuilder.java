package lesson_7.Task32;

import java.util.*;

public class DictionaryBuilder {

    private final ArrayList <String> separateWords = new ArrayList<>();
    private final HashMap<String, Integer> unsortedFrequencyDictionary = new HashMap<>();
    private final LinkedHashMap<String, Integer> frequencyDictionary = new LinkedHashMap<>();


    public void getSeparateWords(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), " -,;.:!?{}[]()\"\n");

        while (stringTokenizer.hasMoreTokens()){
            separateWords.add(stringTokenizer.nextToken().toLowerCase());
        }
    }


    public void buildFrequencyDictionary() {
        ArrayList <String> uniqueWordsList = new ArrayList<>(new LinkedHashSet<>(separateWords));

        for (String string : uniqueWordsList) {
            unsortedFrequencyDictionary.put(string, getWordRepetitions(string, separateWords));
        }
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


    public void sortFrequencyDictionary() {
        List<Map.Entry<String, Integer>> sortingList = new ArrayList<>(unsortedFrequencyDictionary.entrySet());
        sortingList.sort(Map.Entry.comparingByValue());
        Collections.reverse(sortingList);

        for (Map.Entry<String, Integer> entry : sortingList) {
            frequencyDictionary.put(entry.getKey(), entry.getValue());
        }
    }

    public void printSortedDictionary (){
        for (Map.Entry<String, Integer> pair : frequencyDictionary.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\" repeats " + pair.getValue() + " time(s)");
        }
    }
}