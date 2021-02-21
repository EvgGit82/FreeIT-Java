package lesson_2.oprional_tasks;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
*/

import java.util.Arrays;

public class OptTask_05 {
    public static void main(String[] args) {

        int[] randomIntegers = new int[10];
        int positivesCount = 0;
        int negativesCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = (int)(-5 + Math.random()* 10);
        }

        for (int num : randomIntegers) {
            if (num > 0) {
                positivesCount++;
            } else if (num < 0){
                negativesCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Source numbers: " + Arrays.toString(randomIntegers));

        System.out.println("There are " + positivesCount + " positive and "
                + negativesCount + " negative numbers among the source numbers.\n" +
                "And also " + zeroCount + " zeroes.");
    }

}
