package chainogresponsibility;

public class TestChainOfResposibility {

    public static void main(String[] args) {
        Player player1= new Player(TypePlayer.ASSASSIN);
        Wizard wizard= new Wizard(new FireAttack(new IceAttack(new ElectricAttack())));
        wizard.chainAttack(player1);
    }

}
