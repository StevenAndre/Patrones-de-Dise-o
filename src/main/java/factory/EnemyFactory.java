package factory;

public class EnemyFactory {

    public Enemy createEnemy(String enemyType){
        if (enemyType.equalsIgnoreCase("warrior"))
            return new Warrior();
        else if(enemyType.equalsIgnoreCase("wizard"))
            return new Wizard();
        else
            return null;

    }

}
