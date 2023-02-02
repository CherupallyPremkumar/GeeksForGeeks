package DSA;

import java.util.Comparator;

public class PriorityQueuee {
    Object[] queue;

    Comparator<PriorityQueuee> comparator;
    public PriorityQueuee(int initialCapacity , Comparator<PriorityQueuee> comparator)
    {
        if (initialCapacity < 1)
            throw new IllegalArgumentException();
        this.queue = new Object[initialCapacity];
        this.comparator = comparator;
    }

    public PriorityQueuee(int initialCapacity )
    {

    }
}
class MM
{
    public static void main(String[] args) {
        PriorityQueuee p=new PriorityQueuee(3, new Comparator<PriorityQueuee>() {
            @Override
            public int compare(PriorityQueuee o1, PriorityQueuee o2) {
                return 0;
            }
        });
        System.out.println(p.comparator);
    }
}
