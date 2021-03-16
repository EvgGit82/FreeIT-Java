package lesson_3;

/*
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
*/

import java.util.StringTokenizer;

public class Task18 {
    public static void main(String[] args) {

        String str = "При абзацном выделении реплик диалога перед репликой ставится тире; " +
                "после предваряющих диалог слов автора ставится двоеточие или точка. " +
                "Если в авторском тексте имеются вводящие прямую речь слова - после них ставится двоеточие; " +
                "если такие слова отсутствуют, то ставится точка:\n" +
                "Кармен отняла руку; неоконченный такт замер вопросительным звоном!";

        int charsCounter = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(str, "-,;.:!?{}[]()\"");

        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            charsCounter++;
        }

        System.out.println("The text contains " + charsCounter + " punctuation marks.");

    }
}
