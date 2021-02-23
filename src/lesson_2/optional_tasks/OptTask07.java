package lesson_2.optional_tasks;

/*
В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
*/

import java.util.Random;

public class OptTask07 {
    public static void main(String[] args) {

        int developers = new Random().nextInt(200);

        System.out.println("В переменной " + developers + defineCase(developers).toString());
    }

    public static StringBuilder defineCase (int number) {

        StringBuilder result = new StringBuilder();

        if ((number%100) > 10 && (number%100)<15) {
            return result.append(" программистов.");
        } else {
            return switch (number % 10) {
                case 1 -> result.append(" программист.");
                case 2, 3, 4 -> result.append(" программиста.");
                default -> result.append(" программистов.");
            };
        }
    }
}
