package behavioral.observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Concrete observer 1: "+message);
    }
}
