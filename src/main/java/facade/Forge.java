package facade;

public class Forge implements Smithy{

    public static final String ACTION="make";

    @Override
    public void work(String name) {
        System.out.println("let's" +ACTION+" make the "+name+"...");
    }

    @Override
    public boolean search(String name) {
        return Inventary.search(name,true);
    }

    @Override
    public void remove(String name) {
         Inventary.remove(name,true);
    }

    @Override
    public void working(String name) {
        System.out.println("making "+name);
    }
}
