package lesson_2.main_tasks;

import java.util.Random;

/*
Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt()).
Это число – количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
*/

public class Task08 {

    public static void main(String[] args) {

        int amountInRubles = new Random().nextInt(999);

        System.out.println("The amount makes: " + amountInRubles + defineCurrencyRepresentation(amountInRubles));
    }

    public static String defineCurrencyRepresentation (int amount) {

        if (10 < (amount % 100) && (amount % 100) < 15) {
            return " рублей";
        } else {
            return switch (amount % 10) {
                case 1 -> " рубль";
                case 2, 3, 4 -> " рубля";
                default -> " рублей";
            };
        }
    }
}
