package behavioral.iterator;

import java.util.ArrayList;

public class IntList implements Container {
    ArrayList<Integer> list;

    public IntList() {
        list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
    }

    @Override
    public Iterator getIterator() {
        return new ListIterator(list);
    }
}
