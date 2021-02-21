package lesson_2.main_tasks;

/*
Найдите сумму первых n целых чисел, которые делятся на 3.
*/

public class Task_12 {

    public static void main(String[] args) {

        int totalSum = 0;
        int numbers = 3;
        int counter = 0;

        for (int i =1; counter < numbers; i++) {
            if (i%3 ==0) {
                totalSum +=i;
                counter++;
            }
        }

        System.out.println("Total sum of three numbers makes " + totalSum);
    }

}
