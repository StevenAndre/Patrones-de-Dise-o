package prototype;

public class Warrior extends Enemy{

    public Warrior(int health, int damage, int endurance) {
        super(health, damage);
        this.endurance = endurance;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if(warrior!=null){
            setEndurance(warrior.getEndurance());
        }

    }

    private int endurance;

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "endurance=" + endurance +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
