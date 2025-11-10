package chainogresponsibility;

public class IceAttack extends ElementalAttack{

    public IceAttack() {
    }

    public IceAttack(ElementalAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if(player.getTypePlayer().equals(TypePlayer.WARRIOR))
            System.out.println("ICE ATTACK");
        else if (hasNext())
            getNext().attack(player);
        else
            System.out.println("No attack was found!!");



    }
}
