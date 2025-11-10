package abstractfactory;

public class WizardFactory extends EnemyAbstractFactory{


    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }

    @Override
    public Armor addArmor() {
        return new Robe();
    }

    @Override
    public Weapon addWeapon() {
        return new WizardStaff();
    }
}
