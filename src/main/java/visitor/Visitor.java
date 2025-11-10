package visitor;

public interface Visitor {

    void visit(Warrior warrior);
    void visit(Wizard wizard);
    void visit(Assassin assassin);

}
