package lesson_3;

/*
Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
другой с помощью StringBuilder и метода append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
*/

import java.util.GregorianCalendar;

public class Task21 {

    public static void main(String[] args) {

        String [] sourceLines = {"Александр Пушкин начал ", "писать свои первые произведения ", "уже в семь лет. ",
                "В годы учебы в Лицее ", "он прославился, когда прочитал свое ", "стихотворение Гавриилу Державину."};

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        long initTime = gregorianCalendar.getTimeInMillis();

        System.out.println(stringConcat(sourceLines));

        long stringTime = System.currentTimeMillis() - initTime;

        System.out.println("String performance time: " + stringTime + " milliseconds.");

        System.out.println();

        System.out.println(builderConcat(sourceLines));

        long builderTime = System.currentTimeMillis() - initTime - stringTime;

        System.out.println("StringBuilder performance time " + builderTime + " milliseconds.");

        System.out.println();

        System.out.println(bufferConcat(sourceLines));

        long bufferTime = System.currentTimeMillis() - initTime - builderTime;

        System.out.println("StringBuffer performance time " + bufferTime + " milliseconds.");
    }


    public static String stringConcat (String [] array) {

        String resultingString = "";

        for (String string : array) {
            resultingString += string;
        }
        return resultingString;
    }

    public static StringBuilder builderConcat (String [] array) {
        StringBuilder resultingString = new StringBuilder();

        for (String string : array) {
            resultingString.append(string);
        }
        return resultingString;
    }

    public static StringBuffer bufferConcat (String [] array) {
        StringBuffer resultingString = new StringBuffer();

        for (String string : array) {
            resultingString.append(string);
        }
        return resultingString;
    }

}
