package lesson_2.oprional_tasks;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
*/

public class OptTask_14 {

    public static void main(String[] args) {

        int totalSum = 0;

        for (int i = 1; i < 100; i++) {
            if (i%2 !=0){
                totalSum +=i;
            }
        }

        System.out.println("Total amount of every odd number from 1 to 99 makes " + totalSum);

    }

}
