package state;

public class TestState {
    public static void main(String[] args) {

        Mission mission1= new Mission("Mision 1");
        System.out.println(mission1);
        mission1.next();
        System.out.println(mission1);
        mission1.next();
        System.out.println(mission1);
        mission1.next();
        System.out.println(mission1);
        mission1.next();
        System.out.println(mission1);

    }
}
