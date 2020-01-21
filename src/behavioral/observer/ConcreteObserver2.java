package behavioral.observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Concrete observer 2: "+message);
    }
}
