package lesson_6.maintasks.polymorphclasses;

import java.util.LinkedList;

public class PolymorphLinkedList<T> implements IPolymorph<T> {

    private LinkedList<T> list;

    public PolymorphLinkedList(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}