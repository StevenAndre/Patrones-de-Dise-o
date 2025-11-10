package flyweight.assets;

public class Animation {

    private String animation;

    public Animation(String animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "animation='" + animation + '\'' +
                '}';
    }
}
