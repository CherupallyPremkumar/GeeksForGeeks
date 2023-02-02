package DSA;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.NoSuchElementException;


public class LinkedListImp<E> {
    LinkNode head;

    private static class LinkNode<E> {
        E value;
        LinkNode<E> next;

        LinkNode(E value) {
            this.value = value;
            this.next = null;
        }
    }

    public boolean add(E item) {//12,

        LinkNode linkNode = new LinkNode(item);

        if (head == null) {
            head = linkNode;
        } else {
            LinkNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = linkNode;
        }
        return true;
    }

    public void addFirst(E item) {
        LinkNode linkNode = new LinkNode(item);
        if (head == null) {
            head = linkNode;
        } else {
            linkNode.next = head;
            head = linkNode;
        }
    }

    public void add(int index, E in) {
        LinkNode linkNode = new LinkNode(in);
        if (head == null) {

        } else {
            LinkNode last = head;
            int count = 1;
            while (last.next != null) {
                if (count == index) {
                    linkNode.next = last.next;
                    last.next = linkNode;
                    break;
                }

                last = last.next;
                count++;
            }
        }
    }

    public E get(int in) {
        LinkNode last = head;
        int count = 0;
        while (last.next != null) {

            if (count == in) {
                return (E) last.value;

            }
            last = last.next;
            count++;
        }
        return (E) new NullPointerException("index Excceded");
    }

    public void printList() {
        LinkNode current = head;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
    }

    public boolean contains(Object in) {
        if (head == null) {
            throw new NullPointerException("head is null");
        } else {
            LinkNode last = head;
            while (last.next != null) {
                last = last.next;
                if (last.value == in) {
                    return true;
                }
            }
        }
        return false;
    }

    public E remove() {
        LinkNode ll = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            head = head.next;
        }
        return (E) ll.value;

    }

    public boolean remove(Object in) {
        LinkNode last = head;
        if (last.value == in) {
            head = last.next;
        }
        while (last.next != null) {
            if (last.next.value == in) {
                last.next = last.next.next;
            }
            last = last.next;
        }
        return true;
    }

    //merge linked list into one
    public static LinkedListImp merge(LinkedListImp list, LinkedListImp list2) {
        LinkNode node = list.head;
        LinkNode node1 = list2.head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = node1;
        return list;
    }

    public static LinkedListImp accendingorder(LinkedListImp list, LinkedListImp list2) {
        LinkNode listhead = list.head;
        LinkNode list2head = list2.head;
        LinkedListImp list3 = new LinkedListImp();
        list3.add(1);
        LinkNode dummy = list3.head;
        //LinkNode dummy=new LinkNode(-1);
        LinkNode tail = dummy;
        while (true) {
            if (listhead == null) {
                tail.next = list2head;
                break;
            }
            if (list2head == null) {
                tail.next = listhead;
                break;
            }
            if ((int) listhead.value <= (int) list2head.value) {
                tail.next = listhead;
                listhead = listhead.next;
            } else {
                tail.next = list2head;
                list2head = list2head.next;
            }
            tail = tail.next;
        }
        return list3;
    }

    public static LinkedListImp addTwoList(LinkedListImp list, LinkedListImp list2) {
        LinkNode l = list.head;
        LinkNode l2 = list2.head;
        int ll = 0;
        while (l != null || l2 != null) {
            int lval = (l != null) ? (int) l.value : 0;
            int lval2 = (l2 != null) ? (int) l2.value : 0;
            int value = lval + lval2;
            if (value >= 10) {
                if (l.next == null) {
                    l.value = value;
                } else {
                    l.value = (value % 10) + ll;
                }

                ll = (value + ll) / 10;
            } else {
                l.value = value + ll;
                ll = 0;
            }
            l = l.next;
            l2 = l2.next;
        }
        return list;

    }

    public static LinkedListImp addTwoListt(LinkedListImp list, LinkedListImp list2) {
        LinkNode l = list.head;
        LinkNode l2 = list2.head;
        int ll = 0;
        while (l != null || l2 != null) {
            int lval;
            int lval2;
            if (l2 != null) {
                lval2 = (int) l.value;
            } else {
                lval2 = 0;
            }
            lval = (int) l.value;
            int value = lval + lval2;
            if (value >= 10) {
                if (l.next == null) {
                    l.value = value;
                } else {
                    l.value = (value % 10) + ll;
                }

                ll = (value + ll) / 10;
            } else {
                l.value = value + ll;
                ll = 0;
            }
            l = l.next;
            l2 = l2.next;
        }
        return list;

    }

    public static LinkedListImp reverseLinkedList(LinkedListImp list) {
        LinkNode current = list.head;
        LinkNode prev = null;
        LinkNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        return list;
    }

    public static LinkNode reverseLinkedRecursive(LinkNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkNode rest = reverseLinkedRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    //Detect loop in a linked list using Hashing:
    public static boolean detectLoopinLinkedList(LinkNode node) {
        Hashtable<LinkNode, Boolean> hashtable = new Hashtable<>();
        while (node != null) {
            if (hashtable.containsKey(node)) {
                return true;
            } else {
                hashtable.put(node, true);
            }
            node = node.next;
        }
        return false;
    }

    //Detect loop in a linked list using Floyd’s Cycle-Finding Algorithm:
    public static boolean FlyodCycleDetectLoop(LinkNode node) {
        LinkNode slow = node;
        LinkNode fast = node;
        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Detect loop in a linked list by Marking visited nodes without modifying Node structure:
    public static boolean detectloopDummyNode(LinkNode node) {
        LinkNode temp = new LinkNode(Integer.MIN_VALUE);
        while (node != null) {
            if (node.next == temp) {
                return true;
            } else if (node.next == null) {
                return false;
            }
            LinkNode next = node.next;

            node.next = temp;
            node = next;
        }

        return false;
    }

    public LinkedListImp<E> swap(LinkedListImp list, E value1, E value2) {
        if (value1 == value2)
            return list;

        LinkNode prevX = null, currX = list.head;
        while (currX != null && currX.value != value1) {
            prevX = currX;
            currX = currX.next;
        }
        LinkNode prevY = null, currY = list.head;
        while (currY != null && currY.value != value2) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null)
            return list;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        LinkNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        return list;
    }

    public LinkedListImp<E> reverse(LinkedListImp list) {
        LinkNode prev = null;
        LinkNode next = null;
        LinkNode head = list.head;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        list.head = prev;
        return list;

    }/*
    Input: a: 5->10->15, b: 2->3->20
    Output: 2->3->5->10->15->20

    Input: a: 1->1, b: 2->4
    Output: 1->1->2->4*/

    public LinkNode Mergetwosortedlinkedlists(LinkedListImp list, LinkedListImp list2) {
        LinkNode head1 = list.head;
        LinkNode head2 = list2.head;

        LinkNode pointerNode = new LinkNode(-1);
        LinkNode pointer = pointerNode;
        while (true) {
            if (head1 == null) {
                pointer.next = head2;
                break;
            }
            if (head2 == null) {
                pointer.next = head1;
                break;
            }
            if ((int) head1.value <= (int) head2.value) {
                pointer.next = head1;
                head1 = head1.next;
            } else {
                pointer.next = head2;
                head2 = head2.next;
            }
            pointer = pointer.next;

        }
        return pointerNode.next;
    }
    public LinkNode deleteDuplicates(LinkNode head) {
        LinkNode value= head;
        LinkNode dummy=value;
        LinkNode he=head.next;
        while(he!=null)
        {
            if(value.value!=he.value  )
            {
                value.next=he;
                value=value.next;
            }
            if(he.next==null)
            {
                value.next=null;
            }
            he=he.next;
        }
        return dummy;
    }
    public LinkNode removeElements(LinkNode head, int val) {
        if(head==null) return null;
        LinkNode prev=new LinkNode<>(0);
        LinkNode l=prev;
        while(head!=null)
        {
            if((int)head.value!=val)
            {
                l.next=head;
                l=l.next;
            }else
            {
                l.next=null;
            }
            head=head.next;
        }
        return prev.next;
    }
    public LinkNode reverseList(LinkNode head) {
        if(head==null) return null;
        LinkNode dummy=null;
        LinkNode dummy2=null;
        while(head!=null)
        {
            dummy2=head.next;
            head.next=dummy;
            dummy=head;
            head=dummy2;
        }
        return dummy;
    }
    public static LinkNode RotateaLinkedList(LinkedListImp linkedListImp,int value)
    {
        if(value==0 || linkedListImp.head==null) return null;
       LinkNode node= linkedListImp.head;
       LinkNode node1=null;
       int count=1;
        while(node!=null && node.next!=null)
        {
            if(count==value)
            {
                node1=node;
            }
            count++;
            node=node.next;
        }
        node.next= linkedListImp.head;
        LinkNode two=node1.next;
        node1.next=null;
        return two;
    }


    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.add(10);
        list.add(15);
        list.add(17);
        list.add(18);
        LinkedListImp list2 = new LinkedListImp();
        list2.add(1);
        list2.add(1);
        list2.add(3);
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(6);
        LinkNode linkNode = list2.RotateaLinkedList(list2,4);
        while (linkNode != null) {
            System.out.print(linkNode.value + " ");
            linkNode = linkNode.next;
        }



        // accendingorder(list,list2).printList();
        // addTwoList(list, list2).printList();
        // reverseLinkedList(list).printList();
      /* LinkNode l= reverseLinkedRecursive(list.head);
       while(l!=null)
       {
           System.out.println(l.value);
           l=l.next;
       }*/
        //n3.next=n1;
       /*
        merge(list,list2).printList();
       LinkNode l= reverseLinkedRecursive(list.head);
       while(l!=null)
       {
           System.out.println(l.value);
           l=l.next;
       }*/
    }
}