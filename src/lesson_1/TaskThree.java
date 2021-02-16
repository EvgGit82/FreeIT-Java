package lesson_1;

import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {

        timeCalculation(4500);
        timeCalculation(new Random ().nextInt(9999999));
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

}
