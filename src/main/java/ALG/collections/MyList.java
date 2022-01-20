package ALG.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface MyList<E> {
    boolean isEmpty();
    boolean contains(Object o);
    int size();
    boolean add(E e);
    boolean remove(Object o);
    E get(int index);
    E set(int index, E element);

}

