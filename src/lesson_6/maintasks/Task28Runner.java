package lesson_6.maintasks;

import lesson_6.maintasks.polymorphclasses.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

Extension demanded by reviewer Michael:
to extend, you may make a interface and implement this like List and ArrayList
*/

public class Task28Runner {
    public static void main(String[] args) {

        Integer [] integersArray = DataFiller.fillIntegerArray();
        ArrayList <String> stringsArrayList = DataFiller.fillStringsArrayList();
        LinkedList<Double> doublesLinkedList = DataFiller.fillDoublesLinkedList();


        IPolymorph polymorph1 = new PolymorphArray(integersArray);
        IPolymorph polymorph2 = new PolymorphArrayList<>(stringsArrayList);
        IPolymorph polymorph3 = new PolymorphLinkedList(doublesLinkedList);


        List<IPolymorph> polysList = new ArrayList<>(){{
            add(polymorph1);
            add(polymorph2);
            add(polymorph3);
        }};

        System.out.println("Demonstration: ");

        for (IPolymorph polymorph : polysList) {
            System.out.println(polymorph.get(5));
        }
    }
}
