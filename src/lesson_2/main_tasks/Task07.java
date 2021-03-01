package lesson_2.main_tasks;

import java.util.Random;

/*
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть
круглой картонкой радиусом r.
*/

public class Task07 {
    public static void main(String[] args) {

        Random random = new Random();

        int sideA = random.nextInt( 5)+1;
        int sideB = random.nextInt(5)+1;
        int radius = random.nextInt(5)+1;

        System.out.println("a = " + sideA + "; b = " + sideB + "; r = " + radius);

        boolean canCover = canCircleCoverRectangle(sideA, sideB, radius);

        System.out.println(canCover ? "The circle WILL fully cover the rectangle."
                : "The circle will NOT cover the rectangle.");

    }

    public static boolean canCircleCoverRectangle (int sideA, int sideB, int radius) {
        // Comparing rectangle diagonal with the circle diameter
        return (radius*2) >= Math.sqrt((sideA*sideA) + (sideB*sideB));
    }

}