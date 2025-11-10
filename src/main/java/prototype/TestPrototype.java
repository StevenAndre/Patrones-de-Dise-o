package prototype;

public class TestPrototype {
    public static void main(String[] args) {

        Enemy gerrero1= new Warrior(2000,30,25);
        Enemy wizard1= new Wizard(2500,10,200);
        Enemy gerrero2=gerrero1.clone();
        Enemy mago2=wizard1.clone();

        System.out.println(gerrero1);
        System.out.println(gerrero2);
        System.out.println(wizard1);
        System.out.println(mago2);
        mago2.setHealth(500);
        gerrero1.setHealth(670);
        System.out.println("=======================");
        System.out.println(gerrero1);
        System.out.println(gerrero2);
        System.out.println(wizard1);
        System.out.println(mago2);


    }
}
