package chainogresponsibility;

public class FireAttack extends ElementalAttack{

    public FireAttack() {
    }

    public FireAttack(ElementalAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if(player.getTypePlayer().equals(TypePlayer.VAMP))
            System.out.println("FIRE ATTACK");
        else if (hasNext())
            getNext().attack(player);
        else
            System.out.println("No attack was found!!");



    }
}
