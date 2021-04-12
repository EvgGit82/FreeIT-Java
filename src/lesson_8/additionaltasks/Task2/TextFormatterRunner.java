package lesson_8.additionaltasks.Task2;

import lesson_8.additionaltasks.Task2.utils.FileHandler;
import lesson_8.additionaltasks.Task2.utils.TextFormatter;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
*/

public class TextFormatterRunner {

    private static final String SOURCE_TEXT_PATH = "src/lesson_8/additionaltasks/Task2/sourceText.txt";
    private static final String TARGET_TEXT_PATH = "src/lesson_8/additionaltasks/Task2/targetText.txt";
    private static String sourceTextAsString;
    private static ArrayList<String> separateSentences = new ArrayList<>();
    private static ArrayList<String> filteredSentences = new ArrayList<>();

    public static void main(String[] args) {

        TextFormatter textFormatter = new TextFormatter();
        FileHandler fileHandler = new FileHandler();

        sourceTextAsString = fileHandler.readTextFromFile(SOURCE_TEXT_PATH);
        breakTextIntoSentences();
        separateSentences.remove(separateSentences.size()-1);

        for (String aSentence : separateSentences) {
            if (textFormatter.checkSentenceLength(aSentence)){
                filteredSentences.add(aSentence);
            }
        }

        fileHandler.writeTextToFile(TARGET_TEXT_PATH, filteredSentences);

    }

    private static void breakTextIntoSentences () {
        StringTokenizer stringTokenizer = new StringTokenizer(sourceTextAsString, ".");

        while (stringTokenizer.hasMoreTokens()){
            separateSentences.add(stringTokenizer.nextToken().trim() + ".");
        }
    }
}
