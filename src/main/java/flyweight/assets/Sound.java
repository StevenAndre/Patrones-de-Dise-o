package flyweight.assets;

public class Sound {

    private String sounds;

    public Sound(String sounds) {
        this.sounds = sounds;
    }

    @Override
    public String toString() {
        return "Sounds{" +
                "sounds='" + sounds + '\'' +
                '}';
    }
}
