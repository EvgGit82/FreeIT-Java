package lesson_6.maintasks.polymorphclasses;

public class PolymorphArray<T> implements IPolymorph<T> {

    private T[] array;

    public PolymorphArray(T[] array) {
        this.array = array;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}