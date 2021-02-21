package lesson_2.optional_tasks;

/*
В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным,
"двухзначным или трехзначным и более.
*/

import java.util.ArrayList;

public class OptTask01 {
    public static void main(String[] args) {

        int randomNumber = (int)(-1000 + Math.random()* 2000);

        numberDetector(randomNumber);
    }

    public static void numberDetector (int number) {
        if (number == 0) {
            System.out.println("This number is 0");
            return;
        }

        if (number > 0 ) {
            System.out.println(number + " is a positive " + calculateDigits(number) + "-digit number");
        } else {
            System.out.println(number + " is a negative " + calculateDigits(number) + "-digit number");
        }
    }

    public static int calculateDigits (int number){

        int tempNum = Math.abs(number);

        ArrayList<Integer> tempDigits = new ArrayList<>();

        while (tempNum > 0) {
            tempDigits.add(tempNum%10);
            tempNum /= 10;
        }

        return tempDigits.size();
    }

}
