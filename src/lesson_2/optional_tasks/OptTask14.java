package lesson_2.optional_tasks;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
*/

public class OptTask14 {

    public static void main(String[] args) {

        int totalSum = 0;

        for (int i = 1; i < 100; i+=2) {
                totalSum +=i;
        }

        System.out.println("Total amount of every odd number from 1 to 99 makes " + totalSum);

    }

}
