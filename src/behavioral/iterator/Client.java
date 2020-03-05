package behavioral.iterator;

public class Client {
    private static void print(Iterator iterator) {
        System.out.println("Printing values");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        IntArray intArray = new IntArray();
        print(intArray.getIterator());

        IntList list = new IntList();
        print(list.getIterator());
    }
}
