package lesson_8.additionaltasks.Task3;

/*
Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CensorshipRunner {

    private static final String SOURCE_TEXT_PATH = "src/lesson_8/additionaltasks/Task3/sourceText.txt";
    private static final String BLACKLIST_PATH = "src/lesson_8/additionaltasks/Task3/profanesList.txt";
    private static String sourceTextAsString;
    private static ArrayList<String> separateSentences = new ArrayList<>();
    private static ArrayList<String> blacklist = new ArrayList<>();
    private static ArrayList<String> sentencesFilteredOut = new ArrayList<>();


    public static void main(String[] args) {

        sourceTextAsString = getTextFromFile();
        breakTextIntoSentences();
        getBlacklistFromFile();

        for (int i = 0; i < separateSentences.size(); i++) {
            A:    for (String profaneWord : blacklist) {
                if (separateSentences.get(i).contains(profaneWord)){
                    sentencesFilteredOut.add(separateSentences.get(i));
                    break A;
                }
            }
        }

        printResults();

    }

    private static String getTextFromFile () {
        StringBuilder textCollector = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(SOURCE_TEXT_PATH)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                textCollector.append(string).append(" ");
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
        return textCollector.toString();
    }

    private static void breakTextIntoSentences () {
        StringTokenizer stringTokenizer = new StringTokenizer(sourceTextAsString, ".?!");

        while (stringTokenizer.hasMoreTokens()){
            separateSentences.add(stringTokenizer.nextToken().trim());
        }
    }

    private static void getBlacklistFromFile (){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(BLACKLIST_PATH)))
        {
            for (String string; (string = bufferedReader.readLine()) != null; )
                blacklist.add(string.trim());
        }catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    private static void printResults () {
        System.out.println("The text " + ((sentencesFilteredOut.size() > 0) ? "didn't pass" : "passed" )
                + " the assessment.");

        if (sentencesFilteredOut.size() > 0) {
            System.out.println("The text contains " + sentencesFilteredOut.size() + " blacklisted words");
            System.out.println("The following lines shall be modified: ");

            for (String aSentence : sentencesFilteredOut) {
                System.out.println("\"" + aSentence + "\"");
            }
        }
    }
}
