package builder;

public class EnemyBuilder {

    private String name;
    private String type;
    private double damage;
    private double health;
    private  double endurance;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public double getEndurance() {
        return endurance;
    }

    public EnemyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EnemyBuilder type(String type) {
        this.type = type;
        return this;
    }

    public EnemyBuilder damage(double damage) {
        this.damage = damage;
        return this;
    }

    public EnemyBuilder health(double health) {
        this.health = health;
        return this;
    }

    public EnemyBuilder endurance(double endurance) {
        this.endurance = endurance;
        return this;
    }



    public Enemy build(){
        Enemy enemy= new Enemy();
        enemy.setName(getName());
        enemy.setType(getType());
        enemy.setDamage(getDamage());
        enemy.setHealth(getHealth());
        enemy.setEndurance(getEndurance());
        return enemy;
    }

}
