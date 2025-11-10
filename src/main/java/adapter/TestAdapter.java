package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Enemy zombieAdapter=new ZombieAdapter();
        zombieAdapter.damage();
        zombieAdapter.atack();
    }
}
