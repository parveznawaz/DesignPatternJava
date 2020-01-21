package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Observer observer3 = new ConcreteObserver3();

        Subject subject = new ConcreteSubject();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        subject.notifyObserver("First message");
        subject.notifyObserver("Second message");

        subject.removeObserver(observer3);
        subject.notifyObserver("Third message");
    }
}
