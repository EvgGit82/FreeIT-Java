package lesson_3;

/*
Task 22 - Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java,
с помощью регулярных выражений и вывести их на страницу.
Task 23 - Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
например <p id=”p1”>, и замену их на простые теги абзацев <p>.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22_23 {
    public static void main(String[] args) {

        String originalString = "Написать программу, 0x3C выполняющую <p id=”p1”> поиск в строке шестнадцатеричных \n" +
                "0xA29F чисел, записаных <p id=”p56”> по правилам 0BFF Java, " +
                "с помощью 0xfa3 регулярных <p id=”p368”> выражений и 0b32 вывести их 02hjk на страницу";

        System.out.println("The original text looks like this: ");
        System.out.println(originalString);
        System.out.println();

        System.out.println("First let's find and print out all hexadecimal numbers:");
        printHexes(originalString);
        System.out.println();

        System.out.println("Now let's find complex tags and replace them with simple ones:");
        System.out.println("The resulting text will look like this: ");
        System.out.println(originalString.replaceAll("<p\\s.+>", "<p>"));
    }

    public static void printHexes (String string) {
        Pattern hexes = Pattern.compile("0(x|X|b|B)[a-zA-Z0-9]{2,5}");
        Matcher hexMatcher = hexes.matcher(string);

        while (hexMatcher.find()){
            System.out.print(hexMatcher.group() + " ");
        }
        System.out.println();
    }
}
