import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List<T> implements Iterable{
    private T[] list = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        list[count++] = item;

    }

    public T get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
