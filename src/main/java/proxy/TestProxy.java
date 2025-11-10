package proxy;

public class TestProxy {

    public static void main(String[] args) {
        GameImpl game= new GameImpl();
        game.newGame("player1");
        ProxyGameImpl proxyGame= new ProxyGameImpl(game);
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
        proxyGame.getStats().setKills(4);
        proxyGame.getStats().setDeaths(1);
        proxyGame.getStats().setLevel(13);
        proxyGame.save("player1");
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
    }
}
