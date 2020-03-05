package behavioral.iterator;

public class ArrayIterator implements Iterator {
    int[] array;
    int position = 0;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public Object next() {
        return array[position++];
    }
}
