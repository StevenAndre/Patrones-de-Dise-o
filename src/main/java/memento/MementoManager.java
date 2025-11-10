package memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {

    private List<Memento> mementos= new ArrayList<>();
    private int index;

    public MementoManager(){
        index=0;
    }

    public void save(Memento memento){
        mementos.add(memento);
        index= mementos.size();
    }


    public Memento undo(){

        for (Memento m: mementos) {
            System.out.println(m);

        }

        if(mementos.isEmpty() || index>mementos.size())
            throw new IndexOutOfBoundsException("no states");
        Memento memento= mementos.get(index-2);
        index--;
        return memento;
    }
    public Memento redo(){
        if(mementos.isEmpty() || index==0)
            throw new IndexOutOfBoundsException("no states");
        Memento memento= mementos.get(index);
        index++;
        return memento;
    }



}
