package behavioral.iterator;

public class IntArray implements Container {
    int[] items;

    public IntArray() {
        items = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(items);
    }
}
