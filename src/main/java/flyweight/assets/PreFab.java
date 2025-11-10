package flyweight.assets;

import java.util.ArrayList;
import java.util.List;

public class PreFab {


    public PreFab(List<Animation> animations, List<Texture> textures, List<Sound> sounds) {
        this.name = "Prefab:"+id;
        this.animations = animations;
        this.textures = textures;
        this.sounds = sounds;
        id++;
    }

    private static int id;

    private String name;
    private List<Animation> animations = new ArrayList<>();
    private List<Texture> textures = new ArrayList<>();
    private List<Sound> sounds = new ArrayList<>();

    public  int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PreFab{" +
                "name='" + name + '\'' +
                ", animations=" + animations +
                ", textures=" + textures +
                ", sounds=" + sounds +
                '}';
    }
}
