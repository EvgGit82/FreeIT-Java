package lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку
с использованием итератора.
*/

public class Task31 {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            marks.add(i, random.nextInt(10)+1);
        }

        System.out.println(marks.toString());

        Integer maxMark = 0;

        Iterator <Integer> iterator = marks.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num > maxMark) {
                maxMark = num;
            }
        }

        System.out.println("The maximum mark is " + maxMark);
    }
}