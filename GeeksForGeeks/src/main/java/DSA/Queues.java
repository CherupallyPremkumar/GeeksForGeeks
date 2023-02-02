package DSA;

import java.util.Arrays;
import java.util.NoSuchElementException;


class Queues<E> implements Dequeuees<E> {

    private int front, rear;
    private int size;
   private Object[] arr;


    public Queues(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.arr = new Object[size];
    }

    @Override
    public boolean add(E ob) {
        if (front == -1  ) {
            this.arr[++rear] = ob;
            front++;
        } else {
            if(rear <size)
                this.arr[++rear] = ob;
            else
                throw new ArrayIndexOutOfBoundsException("outofbound");
        }
        return true;
    }

    @Override
    public E remove() {
        if(this.front==-1 || arr[this.front]==null)
        {
            throw new NoSuchElementException("no value");
        }
        Object[] newArray=new Object[size];
        Object r=arr[front];
        System.arraycopy(arr,++front,newArray,0,rear);
        this.front--;
        this.rear--;
        arr=newArray;
        return (E) r;
    }

    @Override
    public E poll() {
        if (this.front ==-1 )
        {
            return null;
        }
        Object o=arr[this.front];
         remove();
        return (E)o;
    }

    @Override
    public E element() {
        if(this.front ==-1)
        {
            throw new NoSuchElementException();
        }
        return (E)arr[this.front];
    }

    @Override
    public E peek() {
        if (this.front==-1)
        {
            return null;
        }
        return (E) arr[this.front];
    }

    @Override
    public String toString() {
        return "Queues{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void addFirst(Object ob) {
        Object[] newArray=new Object[size+1];
        System.arraycopy(arr,++front,newArray,1,rear);
        newArray[0]=ob;
        front=0;
        arr=newArray;
    }

    @Override
    public void addLast(Object obj) {
        if(rear<size)
        {
            arr[++rear]=obj;
        }else {
            Object[] newArray = increaseSize();
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            newArray[++rear] = obj;
            arr = newArray;
        }
    }
    private Object[] increaseSize()
    {
        return new Object[getNumber()];
    }
    private int getNumber()
    {
        return size=size+5;
    }
}
class Imp
{
    public static void main(String[] args) {

        Queues<Integer> q=new Queues<Integer>(10);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(100);
        q.add(1677);

        System.out.println(q.toString());
        q.remove();
        System.out.println(q.toString());
        System.out.println(q.peek());
        System.out.println(q.toString());
        q.poll();
        System.out.println(q.element());
        System.out.println(q.toString());
        q.addFirst(17);
        q.add(123);
        System.out.println(q.toString());
        q.add(12);
        System.out.println(q.toString());
        q.add(13);
        System.out.println(q.toString());
        q.addLast(12234);
        q.addLast(1234566);
        System.out.println(q.toString());


    }
}






