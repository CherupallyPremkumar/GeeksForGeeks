package DSA;


public class BinaryTreeImp {
    Node parent;

    public BinaryTreeImp() {

    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    void insert(int value) {
        if (parent == null) {
            parent = new Node(value);
        } else {
            Node dummy = parent;
            while (dummy != null) {
                if (dummy.value > value) {
                    dummy = dummy.left;
                } else {
                    dummy = dummy.right;
                }
                if (dummy == null) {

                } else {

                }
            }

        }

    }

    void insertt(int value) {
        Node newNode = new Node(value);
        if (parent == null) {
            parent = newNode;
        } else {

            Node node;
            Node dummy = parent;
            while (true) {

                if (dummy.value > value) {
                    node = dummy.left;
                    if (node == null) {
                        dummy.left = newNode;
                        break;
                    }
                    dummy = dummy.left;
                } else {
                    node = dummy.right;
                    if (node == null) {
                        dummy.right = newNode;
                        break;
                    }
                    dummy = dummy.right;
                }
            }
        }
    }

    void preprint() {
        Node dummy = parent;
        print(dummy);
    }

    void print(Node parent) {
        if (parent != null) {
            System.out.print(parent.value + " ");
            print(parent.left);
            print(parent.right);
        }
    }


    public static void main(String[] args) {

        BinaryTreeImp binaryTreeImp = new BinaryTreeImp();
        binaryTreeImp.insertt(50);
        binaryTreeImp.insertt(25);
        binaryTreeImp.insertt(75);
        binaryTreeImp.insertt(12);
        binaryTreeImp.insertt(37);
        binaryTreeImp.insertt(43);
        binaryTreeImp.insertt(30);
        binaryTreeImp.preprint();
    }
}
