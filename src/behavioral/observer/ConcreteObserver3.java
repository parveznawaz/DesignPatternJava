package behavioral.observer;

public class ConcreteObserver3 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Concrete observer 3: "+message);
    }
}
