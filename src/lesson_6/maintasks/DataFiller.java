package lesson_6.maintasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DataFiller {

    public static Integer [] fillIntegerArray(){

        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
        }

        return array;
    }

    public static ArrayList<String> fillStringsArrayList(){
        ArrayList <String> list = new ArrayList<>(){{
            add("Mary");
            add("Paul");
            add("John");
            add("George");
            add("Ringo");
            add("Mick");
            add("Richard");
        }};

        return list;
    }

    public static LinkedList<Double> fillDoublesLinkedList (){
        LinkedList<Double> linkedList = new LinkedList<>(){{
            add(1.254);
            add(34.5);
            add(55.69);
            add(46.789);
            add(458.56);
            add(33.7685);
            add(2.6999);
            add(9809.2);
        }};

        return linkedList;
    }

}
