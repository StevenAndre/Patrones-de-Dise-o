package bridge.figther;

public class WizardFighterImplements implements Figther {
    @Override
    public void attack() {
        System.out.println("wizard attack");
    }

    @Override
    public void protect() {
        System.out.println("wizard protect");
    }
}
