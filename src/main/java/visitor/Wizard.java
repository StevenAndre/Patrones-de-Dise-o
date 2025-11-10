package visitor;

public class Wizard implements Visitable {

    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void elementalAttack(){
        System.out.println(getName()+" elementary attack");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
