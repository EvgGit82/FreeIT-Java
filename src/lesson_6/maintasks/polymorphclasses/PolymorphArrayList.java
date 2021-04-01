package lesson_6.maintasks.polymorphclasses;

import java.util.ArrayList;

public class PolymorphArrayList<T> implements IPolymorph {

    ArrayList<T> list;

    public PolymorphArrayList(ArrayList<T> list) {
        this.list = list;
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}