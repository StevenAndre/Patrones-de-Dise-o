package observer;

public class Wizard extends Enemy implements MyObserver{
    public Wizard(String name) {
        super(name);
        setActive(false);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" Wizard attack");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName()+" Wizard is ativate");
    }
    @Override
    public void update() {
        activate();
        attack();
    }
}
