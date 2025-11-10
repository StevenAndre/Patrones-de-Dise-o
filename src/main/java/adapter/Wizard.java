package adapter;

public class Wizard implements Enemy{
    @Override
    public void atack() {
        System.out.println("Wizard attack");
    }

    @Override
    public void damage() {
        System.out.println("Wizard damage");
    }
}
