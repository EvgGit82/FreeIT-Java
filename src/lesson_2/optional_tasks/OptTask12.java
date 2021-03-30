package lesson_2.optional_tasks;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
*/

public class OptTask12 {

    private static final double INCH = 2.54;


    public static void main(String[] args) {


        for (int inches = 1; inches < 21; inches++) {
            System.out.println(inches + " inch(s) = " + (inches*INCH) + " cm.");
        }
    }
}
