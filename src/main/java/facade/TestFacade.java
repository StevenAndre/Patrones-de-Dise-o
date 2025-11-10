package facade;

public class TestFacade {

    /*
    * FACADE es una fachada abstre un proceso mas complejo que
    * llevaria varios pasaos implementa por el cliente pero
    * com facade lo reduce lo maximo posible
    * */
    public static void main(String[] args) {

        FacadeSmithy facade= new FacadeSmithy();

        facade.work("aword",false);
    }
}
