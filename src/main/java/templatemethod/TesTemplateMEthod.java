package templatemethod;

public class TesTemplateMEthod {
    public static void main(String[] args) {

        EnemyTemplate warrior= new Warrior();
        EnemyTemplate wizard= new Wizard();
        warrior.template();
        wizard.template();
    }
}
