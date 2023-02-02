package DSA;

public interface Collectioon<E> {
            int size();
    boolean isEmpty();
            boolean contains(Object obj);
    //iterator
        Object[]  toArray();

          //  toArray
    boolean add(E e);
         boolean remove(Object obj);
   // containsAll
        //    addAll
   // removeAll
            //removeIf
    //retainAll
            void  clear();
    boolean equals(Object obj);
           int hashCode();
    //spliterator
            //stream
    //parallelStream
}
