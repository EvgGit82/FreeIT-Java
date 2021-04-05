package lesson_7;

import java.util.*;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
*/

public class Task30 {
    public static void main(String[] args) {

        Random random = new Random();

        List <Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(i, random.nextInt(20) + 1);
        }

        System.out.println("Original array: ");
        System.out.println(randomNumbers.toString());

        removeRepetitions(randomNumbers);

        System.out.println("Repetitions removed: ");
        System.out.println(randomNumbers.toString());
    }


    public static void removeRepetitions(List<Integer> randomNumbers) {
        LinkedHashSet<Integer> temporaryUniques = new LinkedHashSet<>(randomNumbers);

        randomNumbers.clear();

        randomNumbers.addAll(temporaryUniques);
    }
}