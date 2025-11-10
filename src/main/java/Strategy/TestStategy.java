package Strategy;

public class TestStategy {
    public static void main(String[] args) {
        Player player1= new Player("player1");
        Enemy enemy= new Enemy("Enemy 1");
        enemy.attack(player1);
        System.out.println("------------");
        enemy.setAttackStrategy(new WarriorAttack());
        enemy.attack(player1);
    }
}
