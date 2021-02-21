package lesson_2.oprional_tasks;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
*/

public class OptTask_12 {
    public static void main(String[] args) {

        for (int inch = 1; inch < 21; inch++) {
            System.out.println(inch + " inch(s) = " + (inch*2.54) + " cm.");
        }

    }

}
