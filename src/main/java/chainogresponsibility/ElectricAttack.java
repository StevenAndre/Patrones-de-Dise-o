package chainogresponsibility;

public class ElectricAttack extends ElementalAttack{

    public ElectricAttack() {
    }

    public ElectricAttack(ElementalAttack next) {
        super(next);
    }

    @Override
    public void attack(Player player) {
        if(player.getTypePlayer().equals(TypePlayer.WIZARD))
            System.out.println("ELECTRIC ATTACK");
        else if (hasNext())
            getNext().attack(player);
        else
            System.out.println("No attack was found!!");



    }
}
