package builder;

public class TestBuilder {

    public static void main(String[] args) {

        Enemy enemigo=Enemy.builder()
                .name("ASESINO DEB")
                .type("boss")
                .damage(100)
                .endurance(100)
                .health(500)
                .build();

        System.out.println(enemigo);
    }

}
