package DSA;

import java.util.*;

public class QueueLinkedList<E> implements Lists<E> ,Dequeuees<E> {

    private Node<E> front, rear;
    private Node<E> head;
    private int size;

    public QueueLinkedList(int size) {
        this.front = null;
        this.rear = null;
        this.head = null;
        this.size=size;
    }


    static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

         Node(E value) {
            this.value = value;
            this.next = null;
            this.prev=null;

        }
    }
    E unLink(Node<E> x)
    {

        return (E)"";
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object obj) {

        return indexOf(obj)>=0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        int index =0;
        if (obj != null) {
            for (Node<E> x = front; x != null; x = x.next) {
                if (obj.equals(x.value))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public Lists<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean add(Object ob) {
       final Node<E> node = new Node(ob);
        System.out.println();
        if (front == null) {
            head = node;
            front = node;
            rear = node;
        } else {
            if (rear.next == null) {
                rear.next = node;
                rear = node;
            }
        }
        return true;
    }


    @Override
    public E remove() {
        if(front==null)
        {
            throw new NoSuchElementException();
        }
        Node<E> last=front;
        front= front.next;
        return (E)last.value;
    }

    @Override
    public Object poll() {
         if(front ==null)
         {
             return null;
         }
         Node<E> nextNode=front;
         remove();
         return nextNode.value;
    }

    @Override
    public Object element() {
        if(front==null)
            throw new NoSuchElementException();
        return front.value;
    }

    @Override
    public Object peek() {
        if(front==null)
            return null;
        return front.value;
    }


    @Override
    public void addFirst(Object ob) {
          Node<E> newNode= new Node(ob);
          if(front==null && rear==null)
          {
              head=newNode;
              front=newNode;
              rear=newNode;
          }else {
              newNode.next = front;
          }
          front=newNode;
    }

    @Override
    public void addLast(Object obj) {
        Node<E> newNode= new Node(obj);
        rear.next=newNode;
        rear=newNode;
    }

    public void print() {
        Node<E> pointer = head;
        while (pointer != null) {
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }
}

class USe {
    public static void main(String[] args) {


        QueueLinkedList queueLinkedList = new QueueLinkedList(5);

        queueLinkedList.addFirst(123);
        queueLinkedList.add(125);
        queueLinkedList.print();




    }
}
