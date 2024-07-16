import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    //using array
    int front, rear, size;
    int capacity;
    int[] arr;
    public Queue2(int capacity){
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.arr = new int[this.capacity];
    }
    public void enqueue(int data){
        if(this.size == this.capacity){
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.arr[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data + " enqueued to queue");
    }
    public void dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return;
        }
        int data = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println(data + " dequeued from queue");
    }
    public int peek(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFull(){
        return this.size == this.capacity;
    }
    public void display(){
        for(int i=0; i<this.size; i++){
            System.out.print(this.arr[(this.front + i) % this.capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue2 q = new Queue2(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
       
        q.display();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Is queue full: " + q.isFull());

    }
}

//using Collections framework
class Queue3 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q); // [1, 2, 3, 4, 5]

        q.remove(); // Remove element 1
        q.remove(); // Remove element 2
        q.remove(); // Remove element 3
        q.remove(); // Remove element 4
        q.remove(); // Remove element 5
        
        // Attempt to remove an element from an empty queue
        try {
            q.remove();
        } catch (Exception e) {
            System.out.println("Queue is empty, cannot remove element");
        }

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.remove(); // Remove element 1
        q.remove(); // Remove element 2
        q.remove(); // Remove element 3
        q.remove(); // Remove element 4
        q.remove(); // Remove element 5

        // Attempt to remove an element from an empty queue
        try {
            q.remove();
        } catch (Exception e) {
            System.out.println("Queue is empty, cannot remove element");
        }
    }
}

//using array
class Queue4 {
    int front, rear, size;
    int capacity;
    int[] arr;
    public Queue4(int capacity){
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.arr = new int[this.capacity];
    }
    public void enqueue(int data){
        if(this.size == this.capacity){
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.arr[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data + " enqueued to queue");
    }
    public void dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return;
        }
        int data = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println(data + " dequeued from queue");
    }
    public int peek(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFull(){
        return this.size == this.capacity;
    }
    public void display(){
        for(int i=0; i<this.size; i++){
            System.out.print(this.arr[(this.front + i) % this.capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue4 q = new Queue4(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
       
        q.display();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Is queue full: " + q.isFull());

    }
}

//circular queue using array
class Queue5 {
    int front, rear, size;
    int capacity;
    int[] arr;
    public Queue5(int capacity){
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.arr = new int[this.capacity];
    }
    public void enqueue(int data){
        if(this.size == this.capacity){
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.arr[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data + " enqueued to queue");
    }
    public void dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return;
        }
        int data = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println(data + " dequeued from queue");
    }
    public int peek(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return this.arr[this.front];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFull(){
        return this.size == this.capacity;
    }
    public void display(){
        for(int i=0; i<this.size; i++){
            System.out.print(this.arr[(this.front + i) % this.capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue5 q = new Queue5(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
       
        q.display();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());
        System.out.println("Is queue empty: " + q.isEmpty());
        System.out.println("Is queue full: " + q.isFull());
    }
}

//Stack: It is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out), LIFO implies that the element which is added(Inserted) last is the element which is removed first.

//Queue: That is fundamental data structure in Computer Science use for storing and managing data. It follows the FIFO(First In First Out) order. FIFO implies that the element which is added(Inserted) first is the element which is removed first.
