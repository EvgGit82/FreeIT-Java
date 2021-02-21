package lesson_2.oprional_tasks;

/*
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.util.Random;

public class OptTask_02 {
    public static void main(String[] args) {

        Random random = new Random ();

        int sideA = random.nextInt(10)+1;
        int sideB = random.nextInt(10)+1;
        int sideC = random.nextInt(10)+1;

        System.out.println("side a: " + sideA + " side b: " + sideB + " side: " + sideC);

        if (compareSides(sideA, sideB, sideC) && compareSides(sideB, sideC, sideA) && compareSides(sideC, sideA, sideB)){
            System.out.println("This triangle EXISTS!");
        } else {
            System.out.println("This triangle DOES NOT exist...");
        }
    }

    public static boolean compareSides (int a, int b, int c){
        return a < (b+c) ? true : false;
    }

}
