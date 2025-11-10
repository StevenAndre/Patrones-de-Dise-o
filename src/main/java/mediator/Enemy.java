package mediator;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Combat {
    private String name;

    private Mediator mediator;


    public Enemy(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.add(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void send() {
        System.out.println("sending message from "+name);
        mediator.send(this);
    }

    @Override
    public void reciver(Combat combat) {
        System.out.println("Message received froom "+((Enemy)combat).name);
    }
}
