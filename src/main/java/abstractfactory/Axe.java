package abstractfactory;

public class Axe implements Weapon{
    @Override
    public void damage() {
        System.out.println("Axe damage");
    }
}
