package lesson_8.maintasks.Task34;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму, убрать все
повторяющиеся числа и снова распечатать.
*/

public class NumbersFinderRunner {

    private final static String FILE_PATH = "src/lesson_8/maintasks/Task34/sourceText";

    public static void main(String[] args) {

        NumbersFinder numFinder = new NumbersFinder();

        numFinder.readFile(FILE_PATH);

        numFinder.getNumbersAndNonRepeatingNumbers();

        numFinder.printResults();

    }
}