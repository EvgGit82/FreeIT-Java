package Lesson_1;

import java.util.Random;

public class LessonOne {
    public static void main(String[] args) {

        Random random = new Random ();

        System.out.println("Task Two: ");
        sayHelloMe("Evgeniy");

        System.out.println("Task Three:");
        timeCalculation(4500);
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
        int andSeconds = seconds%60;
        int hours = minutes/60;
        int andMinutes = minutes%60;
        int days = hours/24;
        int andHours = hours%24;
        int weeks = days/7;
        int andDays = days%7;

        System.out.println("In " + seconds + " seconds:");

        System.out.println("- " + minutes + " minute(s) and " + andSeconds + " second(s);");

        System.out.println("- " + hours + " hour(s) and " + andMinutes + " minute(s) " + andSeconds + " second(s);");

        System.out.println("- " + days + " day(s) and " + andHours +
                " hour(s) and " + andMinutes + " minute(s) " + andSeconds+ " second(s);");

        System.out.println("- " + weeks + " week(s) and " + andDays +
                " day(s) and " + andHours + " hour(s) and " + andMinutes + " minute(s) " + andSeconds + " second(s);");

        System.out.println();
    }


    public static void reverseNumber (int number) {

        // Beautiful code (an easy way):
//        StringBuilder reversedString = new StringBuilder(String.valueOf(number));
//        reversedString.reverse();

        // Krivye algorytmi (a hard way):
        StringBuilder reversedString = new StringBuilder("");
        char [] numberAsString = String.valueOf(number).toCharArray();

        for (int i = numberAsString.length-1; i >= 0 ; i--) {
            reversedString.append(numberAsString[i]);
        }

        System.out.println("Original number: " + number + " and Resulting number: " + reversedString);
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

        if (!repetitions) {
            System.out.println("In number " + number + " every figure is different!");
        } else {
            System.out.println("In number " + number + " some figures are repeating...");
        }
    }

}
