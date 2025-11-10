package mediator;

public class Companion implements Combat{

    private String name;

    private Mediator mediator;


    public Companion(String name, Mediator mediator) {
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
        System.out.println("Message received froom "+((Enemy)combat).getName());
    }
}
