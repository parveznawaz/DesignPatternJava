package behavioral.iterator;

import java.util.ArrayList;

public class ListIterator implements Iterator {
    private ArrayList<Integer> list;
    private int position;

    public ListIterator(ArrayList<Integer> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Object next() {
        return list.get(position++);
    }
}
