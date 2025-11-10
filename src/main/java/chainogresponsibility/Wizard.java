package chainogresponsibility;

import java.util.Locale;

public class Wizard {

    private ElementalAttack elementalAttack;

    public Wizard(ElementalAttack elementalAttack) {
        this.elementalAttack = elementalAttack;
    }

    public ElementalAttack getElementalAttack() {
        return elementalAttack;
    }

    public void setElementalAttack(ElementalAttack elementalAttack) {
        this.elementalAttack = elementalAttack;
    }

    public void chainAttack(Player player){
        System.out.println("Attack to "+player.getTypePlayer().name().toLowerCase());
        elementalAttack.attack(player);
    }

}
