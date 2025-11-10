package adapter;

public class Warrior implements Enemy {
    @Override
    public void atack() {
        System.out.println("warrior attack");
    }

    @Override
    public void damage() {
        System.out.println("warrior damage");
    }
}
