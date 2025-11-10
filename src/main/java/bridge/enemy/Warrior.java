package bridge.enemy;

import bridge.figther.Figther;
import bridge.figther.WarriorFighterImplements;

public class Warrior extends Enemy   {
    public Warrior() {
        setFigther(new WarriorFighterImplements());
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
        System.out.println("warrior :");
        getFigther().attack();
    }


    public void protect() {
        System.out.println("warrior :");
        getFigther().protect();
    }
}
