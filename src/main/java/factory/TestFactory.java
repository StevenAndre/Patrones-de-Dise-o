package factory;

public class TestFactory {

    public static void main(String[] args) {
        EnemyFactory enemyFactory= new EnemyFactory();
        Enemy warrior=enemyFactory.createEnemy("warrior");
        Enemy wizard=enemyFactory.createEnemy("wizard");

        warrior.attack();
        wizard.attack();

    }

}
