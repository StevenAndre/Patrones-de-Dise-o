package observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilant extends Enemy implements MyObservable {

    private List<MyObserver> observers=new ArrayList<>();
    public Vigilant(String name) {
        super(name);
        setActive(true);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" Vigilant attack");
    }

    @Override
    public void activate() {
        System.out.println(getName()+" sending messages");
        broadcast();
    }

    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void broadcast() {
        for (MyObserver mb:observers) {
            mb.update();
        }

    }
}
