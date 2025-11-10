package iterator;

public class Inventary {

    private Item head, tail;
    private int size,position;

    public Inventary(Item item) {
        this.head = item;
        this.tail= item;
        position=0;
        size++;

    }

    public Inventary() {
        size=position=0;
    }


    public boolean isEmpty(){
        return size==0;
    }

    public void addEmpty(Item item){

        this.head = item;
        this.tail=item;
        size=1;
    }

    public void addInit(Item item){
        if(isEmpty()){
            addEmpty(item);
            return;
        }


        item.setNext(head);
        head= item;
        size++;

    }
    public void addEnd(Item item){
        if(isEmpty()){
            addEmpty(item);
            return;
        }
        tail.setNext(item);
        tail= item;
        size++;

    }

    private Item get(int pos){
        if(pos>size || pos<0 ||isEmpty())
            return null;

        int count=0;
        Item item= head;
        while (count<pos){
            item=item.getNext();
            count++;
        }
        return item;

    }

    public ItemIterator iterator(){
        return new ItemIterator() {
            @Override
            public boolean hastNext() {
                if(position==size){
                    reset();
                    return false;
                }
                return true;
            }

            @Override
            public Item next() {
                if(!hastNext())
                    return null;
                Item item= get(position);
                position++;
                return item;

            }

            @Override
            public void reset() {
                position=0;
            }
        };
    }



}
