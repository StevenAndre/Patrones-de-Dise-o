package factorymethod;

public class TestFatoryMethod {

    public static void main(String[] args) {

        Enemy warrior= new WarriorFactory().createEnemy();
        Enemy wizard= new WizardFactory().createEnemy();

        warrior.attack();
        wizard.attack();


    }


}
