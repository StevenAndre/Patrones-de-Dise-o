package abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        EnemyAbstractFactory fatory= new WarriorFactory();
        Enemy warrior= fatory.createEnemy();
        Armor heavyArmor= fatory.addArmor();
        Weapon axe= fatory.addWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        fatory=new WizardFactory();
        Enemy wizard= fatory.createEnemy();
        Armor robe= fatory.addArmor();
        Weapon wizardStaff= fatory.addWeapon();
        wizard.attack();
        robe.protect();
        wizardStaff.damage();

    }

}
