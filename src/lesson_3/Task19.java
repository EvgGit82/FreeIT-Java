package lesson_3;

/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут
разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
*/

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {

        String string = " Желательно  учесть, что слова могут    разделяться несколькими пробелами, в начале  и конце " +
                "текста также могут быть пробелы, но могут и отсутствовать ";

        ArrayList <String> wordsList = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), " -,;.:!?{}[]()\"");

        while (stringTokenizer.hasMoreTokens()){
            wordsList.add(stringTokenizer.nextToken());
        }

        System.out.println("This text contains " + wordsList.size() + " words.");
    }
}
