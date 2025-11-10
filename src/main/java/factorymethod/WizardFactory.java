package factorymethod;

public class WizardFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }
}
