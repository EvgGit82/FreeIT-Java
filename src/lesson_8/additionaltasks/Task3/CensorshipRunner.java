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

public class CensorshipRunner {

    private static final String SOURCE_TEXT_PATH = "src/lesson_8/additionaltasks/Task3/sourceText.txt";
    private static final String BLACKLIST_PATH = "src/lesson_8/additionaltasks/Task3/profanesList.txt";


    public static void main(String[] args) {

        new CensorshipFilter()
                .getTextFromFile(SOURCE_TEXT_PATH)
                .breakTextIntoSentences()
                .getBlacklistFromFile(BLACKLIST_PATH)
                .filterBlacklistedWords()
                .printResults();
    }
}
