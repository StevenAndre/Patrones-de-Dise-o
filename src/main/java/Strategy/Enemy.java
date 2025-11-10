package Strategy;

public class Enemy {

    private String name;
    private AttackStrategy attackStrategy;

    public void  attack(Player player){
        attackStrategy.attack(player);
    }

    public Enemy(String name) {
        this.name = name;
        attackStrategy=new UnarmedAttack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
