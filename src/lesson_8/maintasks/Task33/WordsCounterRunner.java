package lesson_8.maintasks.Task33;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
*/

public class WordsCounterRunner {

    private final static String FILE_PATH = "src/lesson_8/maintasks/Task33/sourceText.txt";

    public static void main(String[] args) {

        WordsCounter wordsCounter = new WordsCounter();

        wordsCounter.readFile(FILE_PATH);

        wordsCounter.printResults();
    }
}