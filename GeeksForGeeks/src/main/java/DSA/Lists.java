package DSA;

public interface Lists<E> extends Collectioon<E> {
    E get(int index);
            E set(int index , E element);
    void add( int index, E element);
           E remove(int index);
   int indexOf(Object obj);
           int lastIndexOf(Object obj);



   // listIterator
     //       listIterator
    Lists<E> subList(int fromIndex,int toIndex);
      //      spliterator
    //of
      //      of
    //of
    //        of
    //of
      //      of
    //of
    //        of
   // of
      //      of
    //of
      //      of
    //copyOf
}
