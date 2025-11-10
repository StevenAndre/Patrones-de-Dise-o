package Strategy;

public class WizardAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName()+" health before wizard attack "+player.getHealth());
        System.out.println("wizard attacking");
        player.setHealth(player.getHealth()-20);
        System.out.println(player.getName()+" health after wizard attack "+player.getHealth());
    }
}
