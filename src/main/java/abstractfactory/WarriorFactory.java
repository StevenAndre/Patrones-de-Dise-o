package abstractfactory;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor addArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon addWeapon() {
        return new Axe();
    }
}
