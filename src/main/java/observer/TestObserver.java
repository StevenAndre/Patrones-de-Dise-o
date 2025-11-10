package observer;

public class TestObserver {
    public static void main(String[] args) {

        Vigilant vigilante= new Vigilant("Vigilante");
        vigilante.subscribe(new Warrior("warrior 1"));
        vigilante.subscribe(new Warrior("warrior 2"));
        Warrior warrior3= new Warrior("warrior 3");
        vigilante.subscribe(warrior3);
        vigilante.subscribe(new Wizard("Wizard 1"));
        vigilante.subscribe(new Wizard("Wizard 2"));
        vigilante.broadcast();
        System.out.println("----------unsubscribe-----------");
        vigilante.unsubscribe(warrior3);
        vigilante.broadcast();


    }
}
