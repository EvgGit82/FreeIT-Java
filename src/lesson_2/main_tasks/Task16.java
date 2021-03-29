package lesson_2.main_tasks;

import java.util.Arrays;
import java.util.Random;

/*
Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
*/

public class Task16 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        int indexMax = findMaxAndMin(randomNumbers, "max");
        int indexMin = findMaxAndMin(randomNumbers, "min");


        System.out.println(Arrays.toString(randomNumbers));

        System.out.println("Max: " + indexMax);
        System.out.println("Min: " + indexMin);

        System.out.println("Total sum between the minimum and maximum units makes "
                + calculateSumBetweenMinAndMax(randomNumbers, indexMin, indexMax));
    }


    public static int calculateSumBetweenMinAndMax(int [] array, int indexMin, int indexMax){

        int totalSum = 0;

        int firstNumberIndex = Math.min(indexMax, indexMin);
        int lastNumberIndex = Math.max(indexMax, indexMin);

        for (int i = firstNumberIndex + 1; i < lastNumberIndex; i++) {
            totalSum += array[i];
        }
        return totalSum;
    }

    public static int findMaxAndMin (int [] array, String maxOrMin){

        int maxValue = array[0];
        int indexMax = 0;
        int minValue = array[0];
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexMax = i;
            }

            if (array[i] < minValue) {
                minValue = array[i];
                indexMin = i;
            }
        }

        if (maxOrMin.equals("max")) {
            return indexMax;
        } else if (maxOrMin.equals("min")){
            return indexMin;
        }
        return -1;
    }

}
