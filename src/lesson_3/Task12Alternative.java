package lesson_3;

/*
Найти сумму первых n чисел, которые делятся на 3 без остатки и каждое последующее число не должно являться степенью тройки.
 */

import java.util.ArrayList;

public class Task12Alternative {

    public static void main(String[] args) {

        int n = 3;

        System.out.println("Total sum of " + n + " first numbers divisible by three and excluding multiples of 3 makes " + getSumOfN(n));
    }

    public static int getSumOfN (int n) {

        int totalSum = 0;
        int counter = 0;

        for (int i =1; counter < n; i++) {
            if (i%3 == 0 && !isPowerOfThree(i)) {
                totalSum +=i;
                counter++;
            }
        }
        return totalSum;
    }

    public static boolean isPowerOfThree (int number){

        ArrayList<Integer> unwantedNumbersList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            unwantedNumbersList.add(calcPower(3, i));
        }
        return unwantedNumbersList.contains(number);
    }

    public static int calcPower(int number, int power) { // We pretended we had no idea of Math.pow() back then

        if (power == 0) { return 1; }

        int multiplier = number;

        for (int i = 1; i < power; i++) {
            number *= multiplier;
        }
        return number;
    }

}
