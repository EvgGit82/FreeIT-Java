package lesson_2.main_tasks;

import java.util.Random;

/*
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
*/

public class Task_09 {
    public static void main(String[] args) {

        int numberWithinRange = new Random().nextInt(9);

        System.out.println("(" + numberWithinRange + ")! = " + calculateFactorial(numberWithinRange));
    }

    public static int calculateFactorial(int number) {

        int result = 1;

        if (number == 0 || number == 1) {
            return 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
