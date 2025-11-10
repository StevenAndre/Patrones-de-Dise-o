package memento;

public class TestMemento {
    public static void main(String[] args) {
        Game game= new Game("partida steven",1,0);
        game.save();
        System.out.println("Save 1" +game);
        game= new Game("partida steven",3,6);
        game.save();
        System.out.println("Save 2" +game);
       game.setLevel(10);
        game.setKills(11);
        game.save();
        System.out.println("Save 3" +game);

        System.out.println("==========================");
        game= new Game("partida steven");
        game.back();

        System.out.println("back 1" +game);
        game.back();
        System.out.println("back 2" +game);
        game.forward();
        System.out.println("forward 1" +game);
        game.forward();
        System.out.println("forward 2" +game);


    }
}
