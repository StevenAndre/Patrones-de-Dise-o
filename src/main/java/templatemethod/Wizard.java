package templatemethod;

public class Wizard extends EnemyTemplate{
    @Override
    public void setSkills() {
        System.out.println("Health: 200, Mana: 150,Stamina: 50 ");
    }

    @Override
    public void attack() {
        System.out.println("Wizard attack");
    }

    @Override
    public void protect() {
        System.out.println("Wizard protect");
    }

    @Override
    public void result() {
        System.out.println("Wizard has survived ");
    }
}
