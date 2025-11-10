package chainogresponsibility;

public abstract class ElementalAttack {

    protected ElementalAttack next;

    public ElementalAttack() {
    }

    public ElementalAttack(ElementalAttack next) {
        this.next = next;
    }

    public ElementalAttack getNext() {
        return next;
    }

    public void setNext(ElementalAttack next) {
        this.next = next;
    }

    public boolean hasNext(){
        return getNext()!=null;
    }

    public abstract void attack(Player player);

}
