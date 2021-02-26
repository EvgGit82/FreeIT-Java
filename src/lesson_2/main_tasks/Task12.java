package lesson_2.main_tasks;

/*
Найдите сумму первых n целых чисел, которые делятся на 3.
*/

public class Task12 {

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Total sum of " + n + " first numbers divisible by three makes " + getSumOfN(n));
    }

    public static int getSumOfN (int n) {

        int totalSum = 0;
        int counter = 0;

        for (int i =1; counter < n; i++) {
            if (i%3 == 0) {
                totalSum +=i;
                counter++;
            }
        }
        return totalSum;
    }

}
