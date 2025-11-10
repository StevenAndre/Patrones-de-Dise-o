package Strategy;

public class UnarmedAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName()+" health before Unarmed attack "+player.getHealth());
        System.out.println("Unarmed attacking");
        player.setHealth(player.getHealth()-20);
        System.out.println(player.getName()+" health after Unarmed attack "+player.getHealth());
    }
}
