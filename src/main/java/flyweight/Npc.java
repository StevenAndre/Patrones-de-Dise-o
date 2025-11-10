package flyweight;

import flyweight.assets.PreFab;



public class Npc {

    private static final int MAX_HEALTH=100;
    private static int id;

    private String name;
    private PreFab preFab;

    private int health;

    public Npc(PreFab preFab) {
        this.name = "NPC:"+id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.preFab=preFab;
        id++;
    }

    private Coordinates coordinates;


    public void showNPC() {
        System.out.println( "Npc{" +
                "name='" + name + '\'' +
                ", preFab=" + preFab.toString() +
                ", health=" + health +
                ", coordinates=" + coordinates +
                '}');
    }
}
