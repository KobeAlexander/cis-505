package Module_4.BowlingShopApp;
// Importing all utility classes
import java.util.*;



public class GenericQueue<E> {
    
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue (E item)
    {
        list.addFirst(item);
    }

    public E dequeue()
    {
        E value = list.getFirst();
        list.removeFirst();
        return value;
    }

    public int size()
    {
        return list.size();
    }
}
