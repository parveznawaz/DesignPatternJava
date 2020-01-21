package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observers;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String message) {
        System.out.println("Start sending message");
        for (Observer o : observers) {
            o.update(message);
        }
        System.out.println("End sending message\n");
    }
}
