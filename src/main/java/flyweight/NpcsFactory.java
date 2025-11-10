package flyweight;


import flyweight.assets.AssetsPreFab;
import flyweight.assets.PreFab;

public class NpcsFactory {


    public static Npc createNpc(PreFab preFab){
        PreFab preFabnew= AssetsPreFab.getPreFabMap(preFab);
        Npc npc= new Npc(preFabnew);
        return npc;
    }

}
