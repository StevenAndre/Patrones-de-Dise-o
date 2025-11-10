package bridge;

import bridge.enemy.Enemy;
import bridge.enemy.Warrior;
import bridge.enemy.Wizard;
import bridge.figther.WarriorFighterImplements;
import bridge.figther.WizardFighterImplements;

public class TestBridge {

    public static void main(String[] args) {

        Warrior warrior= new Warrior();


        warrior.attack();
        warrior.protect();
        System.out.println("============================");
        warrior.setFigther(new WizardFighterImplements());
        warrior.attack();
        warrior.protect();

        System.out.println("-------------wizard-------------");

        Wizard wizard= new Wizard();
        wizard.attack();
        warrior.protect();
        System.out.println("========================");
        wizard.setFigther(new WarriorFighterImplements());
        wizard.attack();
        warrior.protect();


    }

}
