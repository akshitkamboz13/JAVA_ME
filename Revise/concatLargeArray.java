package Revise;
import java.util.Scanner;

public class concatLargeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,9};
        int[] arr2 = {6,7,8,5,10};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr1.length; i++){
            int largest = arr1[i];
            int flag = 0;
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if(arr[j] < largest){
                    flag = 1;
                    count = j;
                }
            }
            if(flag == 1){
                arr[count] = arr1[i];
            }
        }
        for(int i=0; i<arr2.length; i++){
            int largest = arr2[i];
            int flag = 0;
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if(arr[j] < largest){
                    flag = 1;
                    count = j;
                }
            }
            if(flag == 1){
                arr[count] = arr2[i];
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}


//25 321

//Reverse a doubly linked list 
class DoublyLinked{
    Node head;
    Node tail;
    int size;

    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public void addFirst(int data){
        Node nn = new Node(data);
        if(size == 0){
            head = nn;
            tail = nn;
        }else{
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
        size++;
    }

    public void print(){
        if(head == null){
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node curr = head;
        while(curr != null){
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        DoublyLinked dl = new DoublyLinked();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.addFirst(5);
        dl.print();
        dl.reverse();
        dl.print();
    }
}

//input Array
// Input -> [2,7,11,15]
class InputArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.substring(1, n.length()-1).split(",");
        int[] a = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        for(int i : a){
            System.out.print(i + " ");
        }
        sc.close();
    }
}