package bridge.figther;

public class WarriorFighterImplements implements Figther {
    @Override
    public void attack() {
        System.out.println("warrior attack");
    }

    @Override
    public void protect() {
        System.out.println("warrior protect");
    }
}
