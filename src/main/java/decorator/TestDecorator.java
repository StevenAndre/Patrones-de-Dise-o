package decorator;

import decorator.decorator.AssassinEnemyDecorator;
import decorator.decorator.WarriorEnemyDecorator;
import decorator.decorator.WizardEnemyDecorator;
import decorator.race.Elf;
import decorator.race.Human;

public class TestDecorator {

    public static void main(String[] args) {

        System.out.println("-------------human warrior-----------");
        Enemy humanWarrior= new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("-------------human wizard-----------");
        Enemy humanWaariorWizard= new WarriorEnemyDecorator(new WizardEnemyDecorator(new Human()));
        humanWaariorWizard.attack();
        System.out.println("-------------Elf warrior wizard assassin-----------");
        Enemy elfWarriorWizardAssassin=new WarriorEnemyDecorator(new WizardEnemyDecorator(new AssassinEnemyDecorator(new Elf())));
        elfWarriorWizardAssassin.attack();

    }

}
