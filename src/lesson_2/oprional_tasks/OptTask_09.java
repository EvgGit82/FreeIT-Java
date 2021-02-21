package lesson_2.oprional_tasks;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
*/

import java.util.Random;

public class OptTask_09 {
    public static void main(String[] args) {

        Random random = new Random();

        int originalAmoebacount = random.nextInt(10);
        int hours = random.nextInt(100);

        System.out.println("After " + hours + " hours the number of amoeba will make "
                + countAmoeba(originalAmoebacount, hours) + " animals");
    }

    public static int countAmoeba (int amoeba,  int hours){

        for (int i = 0; i < hours/3; i++) {
            amoeba *= 2;
        }
        return amoeba;
    }

}
