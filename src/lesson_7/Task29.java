package lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка
*/


public class Task29 {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            marks.add(i, random.nextInt(10)+1);
        }

        System.out.println("Initial marks list: ");
        System.out.println(marks);

        Iterator <Integer> iterator = marks.iterator();

        while (iterator.hasNext()){
            int aMark = iterator.next();
            if (aMark < 6){
                iterator.remove();
            }
        }

        System.out.println("All marks below 6 have been deleted: ");
        System.out.println(marks);

    }
}