package lesson_8.additionaltasks.Task1;

/*
В исходном файле находятся слова, каждое слово на новой строке. После запуска программы должен создать файл,
который будет содержать в себе только палиндромы.
*/

public class PalindromeFilterRunner {

    private static final String SOURCE_FILE_PATH = "src/lesson_8/additionaltasks/Task1/sourceFile.txt";
    private static final String TARGET_FILE_PATH = "src/lesson_8/additionaltasks/Task1/targetFile.txt";

    public static void main(String[] args) {

        new PalindromeFilter()
                .readLinesFromFile(SOURCE_FILE_PATH).
                filterWordsList()
                .writeLinesToFile(TARGET_FILE_PATH);
    }
}
