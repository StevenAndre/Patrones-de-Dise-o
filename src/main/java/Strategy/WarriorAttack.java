package Strategy;

public class WarriorAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName()+" healht before warrior attack "+player.getHealth());
        System.out.println("Warrior attacking");
        player.setHealth(player.getHealth()-20);
        System.out.println(player.getName()+" healht after warrior attack "+player.getHealth());
    }
}
