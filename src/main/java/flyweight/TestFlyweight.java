package flyweight;

import flyweight.assets.Animation;
import flyweight.assets.PreFab;
import flyweight.assets.Sound;
import flyweight.assets.Texture;

import java.util.Arrays;
import java.util.List;

public class TestFlyweight {
    public static void main(String[] args) {

        List<Animation>animations= Arrays.asList(
                new Animation("walk"),
                new Animation("run")
        );
        List<Texture>textures= Arrays.asList(
                new Texture("texture1"),
                new Texture("texture2")
        );
        List<Sound>sounds= Arrays.asList(
                new Sound("SOUND 1"),
                new Sound("SOUND 2")
        );

        PreFab preFab1=new PreFab(animations,textures,sounds);
        Npc npc1= new Npc(preFab1);
        Npc npc2= new Npc(preFab1);
        npc1.showNPC();
        npc2.showNPC();

        System.out.println("---------------");

        List<Animation>animations2= Arrays.asList(
                new Animation("eat"),
                new Animation("swing")
        );
        List<Texture>textures2= Arrays.asList(
                new Texture("texture3"),
                new Texture("texture4")
        );
        List<Sound>sounds2= Arrays.asList(
                new Sound("SOUND 3"),
                new Sound("SOUND 4")
        );

        PreFab preFab2=new PreFab(animations2,textures2,sounds2);
        Npc npc3= new Npc(preFab2);
        Npc npc4= new Npc(preFab2);
        npc3.showNPC();
        npc4.showNPC();
    }
}
