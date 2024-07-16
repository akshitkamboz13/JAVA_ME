public class LinkedListTest {

}

class linkedlist {
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void addfirst(int data) {
        node nn = new node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void addLast(int data) {
        node nn = new node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;

    }

    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("end");

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public int getFirst() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return -1;
        }
        return head.data;
    }

    public int getLast() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return -1;
        }
        return tail.data;
    }

    public int getAt(int idx) {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return -1;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("invalid index");
            return -1;
        }
        node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAt(2));
    }
}

class AddInLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node nn = new Node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void addLast(int data) {
        Node nn = new Node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;
    }

    public void addAt(int data, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("invalid index");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        Node nn = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        AddInLinkedList ll = new AddInLinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addAt(100, 3);
        ll.print();
    }
}

// Double Linked List
class DoubleLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node nn = new Node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        nn.next = head;
        head.prev = nn;
        head = nn;
    }

    public void addLast(int data) {
        Node nn = new Node(data);
        size++;
        if (head == null) {
            head = tail = nn;
            return;
        }
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
    }

    public void addAt(int data, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("invalid index");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        Node nn = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next.prev = nn;
        temp.next = nn;
        nn.prev = temp;
    }

    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void swapByK(int k) {
        if (k == 0) {
            return;
        }
        Node temp = head;
        Node temp1 = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        while (temp != null) {
            int t = temp.data;
            temp.data = temp1.data;
            temp1.data = t;
            temp1 = temp1.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addAt(100, 3);
        ll.print();
        ll.swapByK(2);
        ll.print();
    }
}
