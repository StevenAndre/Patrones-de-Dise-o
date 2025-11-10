package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread hilo1= new Thread(new CrearPepe());
        Thread hilo2= new Thread(new CrearJuan());
        hilo1.start();
        hilo2.start();
    }



}
class CrearPepe implements Runnable{

    @Override
    public void run() {
        Player player= Player.getPlayer("PEPE");

        System.out.println(player);
    }
}
class CrearJuan implements Runnable{

    @Override
    public void run() {
        Player player= Player.getPlayer("JUAN");

        System.out.println(player);
    }
}