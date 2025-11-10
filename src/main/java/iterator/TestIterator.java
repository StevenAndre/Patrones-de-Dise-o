package iterator;


import java.util.Iterator;

public class TestIterator {


    public static void main(String[] args) {

        ListNode<String> lsi= new ListNode<>(new Node<>("Hola"));
        lsi.addEnd("como");
        lsi.addEnd("estas");
        Iterator<Node<String>> iterator=lsi.iterator();
        /*while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        lsi.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++");
        Inventary inventary= new Inventary();
        inventary.addEnd(new Item("1",18));
        inventary.addEnd(new Item("2",18));
        inventary.addEnd(new Item("3",18));
        inventary.addEnd(new Item("4",18));
        inventary.addInit(new Item("0",18));
        ItemIterator itemIterator= inventary.iterator();
        while(itemIterator.hastNext()){
            System.out.println(itemIterator.next());
        }

        while(itemIterator.hastNext()){
            System.out.println(itemIterator.next());
        }
    }

}
