package prototype;

public abstract class Enemy {
    protected int health;
    protected int damage;

    public Enemy(Enemy enemy) {
        if (enemy!=null){
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());

        }
    }

    public abstract Enemy clone();

    public int getHealth() {
        return health;
    }

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }



}
