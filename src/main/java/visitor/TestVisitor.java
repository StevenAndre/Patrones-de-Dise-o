package visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Warrior warrior=new Warrior("warrior 1");
        Wizard wizard=new Wizard("wizard 1");
        Assassin assassin=new Assassin("assassin 1");
        EnemyVisitor enemyVisitor= new EnemyVisitor();
        enemyVisitor.visit(warrior);
        System.out.println("++++++++++++++++++++++++++++++");
        enemyVisitor.visit(wizard);
        System.out.println("++++++++++++++++++++++++++++++");
        enemyVisitor.visit(assassin);



    }
}
