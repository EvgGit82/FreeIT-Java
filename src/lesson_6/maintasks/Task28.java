package lesson_6.maintasks;

import java.util.Arrays;
import java.util.Random;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
*/

public class Task28 {
    public static void main(String[] args) {

        Random random = new Random();

        Integer [] array = new Integer [10];
        String [] stringArray = {"Mary", "Paul", "John", "George", "Ringo", "Mick", "Richard"};

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));

        PolymorphArray<Integer> polymorphArray = new PolymorphArray<>();
        polymorphArray.setItem(array);

        System.out.println(polymorphArray.get(5));

        System.out.println();

        System.out.println(Arrays.toString(stringArray));

        PolymorphArray<String> polymorphArray2 = new PolymorphArray<>();
        polymorphArray2.setItem(stringArray);

        System.out.println(polymorphArray2.get(5));
    }
}

class PolymorphArray<T> {

    private T[] item;

    public void setItem(T[] item) {
        this.item = item;
    }

    public T get(int index) {
        return item[index];
    }
}