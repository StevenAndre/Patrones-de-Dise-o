package mediator;

public class TestMediator {
    public static void main(String[] args) {


        Mediator mediator= new Mediator();
        Enemy enemy1= new Enemy("Enemy 1",mediator);
        Enemy enemy2= new Enemy("Enemy 2",mediator);
        Enemy enemy3= new Enemy("Enemy 3",mediator);
        Companion companion= new Companion("Companion 1",mediator);
        enemy1.send();

    }
}
