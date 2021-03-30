package lesson_2.main_tasks;

/*
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
*/

public class Task10 {

    public static void main(String[] args) {

        int randomWithinRange = (int)(10 + Math.random()* 5);

        System.out.println("(" + randomWithinRange + ")! = " + calculateFactorial(randomWithinRange));

    }

    public static long calculateFactorial(int number) {

        long result = 1;

            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
}
