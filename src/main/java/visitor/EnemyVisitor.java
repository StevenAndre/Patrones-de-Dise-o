package visitor;

public class EnemyVisitor implements Visitor {
    @Override
    public void visit(Warrior warrior) {
        System.out.println("visiting warrior");
        warrior.powerAttack();
    }

    @Override
    public void visit(Wizard wizard) {
        System.out.println("visiting Wizard");
        wizard.elementalAttack();
    }

    @Override
    public void visit(Assassin assassin) {
        System.out.println("visiting Assassin");
        assassin.stealthAttack();
    }
}
