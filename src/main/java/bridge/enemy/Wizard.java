package bridge.enemy;

import bridge.figther.Figther;
import bridge.figther.WizardFighterImplements;

public class Wizard extends Enemy   {
    public Wizard() {
        setFigther(new WizardFighterImplements());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public void attack() {
        System.out.println("wizard :");
        getFigther().attack();
    }


    public void protect() {
        System.out.println("wizard :");
        getFigther().protect();
    }
}
