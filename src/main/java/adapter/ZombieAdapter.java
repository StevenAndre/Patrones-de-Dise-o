package adapter;

public class ZombieAdapter implements Enemy{

    private Zombie zombie;

    public ZombieAdapter() {
        this.zombie = new Zombie();
    }

    @Override
    public void atack() {
        int value=(int) (Math.random()*10);
        if(value>5)
            zombie.bite();
        else
            zombie.hit();

    }

    @Override
    public void damage() {
        int value=(int) (Math.random()*10);
        if(value>5)
            zombie.headDamage();
        else
            zombie.bodyDamage();

    }
}
