package lesson_3;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
*/

public class Task20 {
    public static void main(String[] args) {

        String string = "Связано это в первую очередь с тем, что строка, содержащаяся в объекте " +
                "String, не может меняться. При изменении содержимого строки создается новый " +
                "объект. В ряде случаев это может привести к большим потерям в " +
                "производительности. В частности, операция вида:";

        ArrayList <String> wordsList = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), " -,;.:!?{}[]()\"");

        while (stringTokenizer.hasMoreTokens()){
            wordsList.add(stringTokenizer.nextToken());
        }

        for (String word : wordsList) {
            System.out.print(toLowerCase(word).charAt(word.length()-1));
        }
    }

    public static String toLowerCase (String word) {
        return word.toLowerCase();
    }
}
