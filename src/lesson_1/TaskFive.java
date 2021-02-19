package lesson_1;

import java.util.Random;

/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
*/

public class TaskFive {

    public static void main(String[] args) {

        findDifferentNumbers(new Random ().nextInt(9999));

    }


    public static void findDifferentNumbers (int number) {

        System.out.print("In number " + number);

        int [] digitsArray = new int [findArraySize(number)];

        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = number%10;
            number /= 10;
        }

        boolean repetitions = false;

        for (int i = 0; i < digitsArray.length; i++) {
            for (int j = i+1; j < digitsArray.length; j++) {
                if (digitsArray[i] == digitsArray [j]) {
                    repetitions = true;
                    break;
                }
            }
        }

        if (!repetitions) { System.out.println(" every digit is different!");
        } else { System.out.println(" some digits are repeating..."); }

    }


    public static int findArraySize (int number) {

        int arraySize = 0;

        while (number > 0) {
            number /= 10;
            arraySize++;
        }
        return arraySize;
    }

}