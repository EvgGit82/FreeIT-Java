package Lesson_1;

import java.util.Random;

public class LessonOne {
    public static void main(String[] args) {

        Random random = new Random ();

        System.out.println("Task Two: ");
        sayHelloMe("Evgeniy");

        System.out.println("Task Three:");
        timeCalculation(random.nextInt(9999999));

        System.out.println("Task Four: ");
        reverseNumber(random.nextInt(9999));

        System.out.println("Task Five: ");
        findDifferentNumbers(random.nextInt(9999));
    }


    public static void sayHelloMe (String name) {

        System.out.println("Hello, " + name);
        System.out.println();
    }


    public static void timeCalculation (int seconds) {

        int minutes = seconds/60;

        System.out.println("In " + seconds + " seconds:");
        System.out.println("- " + minutes + " minute(s) and " + seconds%60 + " second(s);");

        int hours = minutes/60;

        System.out.println("- " + hours + " hour(s) and " + minutes%60 + " minute(s) " + seconds%60 + " second(s);");

        int days = hours/24;

        System.out.println("- " + days + " day(s) and " + hours%24 +
                " hour(s) and " + minutes%60 + " minute(s) " + seconds%60 + " second(s);");

        int weeks = days/7;

        System.out.println("- " + weeks + " week(s) and " + days%7 +
                " day(s) and " + hours%24 + " hour(s) and " + minutes%60 + " minute(s) " + seconds%60 + " second(s);");

        System.out.println();
    }


    public static void reverseNumber (int number) {

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        stringBuilder.reverse();

        System.out.println("Original number: " + number + " and Resulting number: " + stringBuilder);
        System.out.println();
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

        if (repetitions == false) {
            System.out.println("In number " + number + " every figure is different!");
        } else {
            System.out.println("In number " + number + " some figures are repeating...");
        }
    }

}
