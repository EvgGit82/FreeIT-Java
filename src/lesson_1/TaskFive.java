package lesson_1;

import java.util.Random;

public class TaskFive {

    public static void main(String[] args) {

        Random random = new Random ();

        findDifferentNumbers(random.nextInt(9999));

    }

    public static void findDifferentNumbers (int number) {

        char [] inchars = String.valueOf(number).toCharArray();

        boolean repetitions = false;

        for (int i = 0; i < inchars.length; i++) {
            for (int j = i+1; j < inchars.length; j++) {
                if (inchars[i] == inchars [j]) {
                    repetitions = true;
                    break;
                }
            }
        }

        if (!repetitions) {
            System.out.println("In number " + number + " every figure is different!");
        } else {
            System.out.println("In number " + number + " some figures are repeating...");
        }
    }

}
