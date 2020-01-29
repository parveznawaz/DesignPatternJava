package creational.singleton.eager;

public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("Only one instance of Singleton");
        } else {
            System.out.println("Separate instances created");
        }
    }
}
