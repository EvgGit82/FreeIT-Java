package lesson_1;

import java.util.Random;
 
/*
Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n
*/

public class TaskFour {

    public static void main(String[] args) {

        int originalNumber = new Random().nextInt(9999999);

        System.out.print("Original number: " + originalNumber
                + " and Reversed number: " + reverseNumber(originalNumber));
    }

    public static StringBuilder reverseNumber (int originalNumber) {

        StringBuilder reversedNumber = new StringBuilder();

        while (originalNumber >0) {
            reversedNumber.append(originalNumber%10);
            originalNumber /= 10;
        }
        return reversedNumber;
    }
}
