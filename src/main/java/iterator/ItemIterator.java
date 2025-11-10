package iterator;

public interface ItemIterator {
    boolean hastNext();
    Item next();
    void reset();
}
