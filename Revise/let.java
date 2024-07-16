package Revise;

import java.util.ArrayList;

public class let {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean flag = false;

        for(int i=0; i<nums.length; i++){
            flag = false;
            for(int j = 0; j<arr.size(); j++){
                if(nums[i] == arr.get(j)){
                    flag = true;
                }
            }
            if(flag == false){
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);
        return arr.size();
    }

    public static void main(String[] args) {
        let l = new let();
        int[] arr = {1,1,2};
        System.out.println(l.removeDuplicates(arr));
    }
    
}

class let22{
        public int removeDuplicates(int[] nums) {
            int count = nums.length;
            
            for(int i=0; i<nums.length; i++){
                int pos = i;
                for(int j = pos+1; j<nums.length; j++){
                    if(nums[i] == nums[j] && nums[i] != 0){
                        nums[j] = 0;
                        count--;
                    }
                    else if(nums[i] != nums[j] && nums[i] !=0 && nums[j] != 0){
                        nums[pos+1] = nums[j];
                        nums[j] = -1;
                        pos++;
                    }
                    
                }
            }
            for(int i : nums){
                System.out.print(i + " ");
            }
            return count+1;
        }
    public static void main(String[] args) {
        let22 l = new let22();
        int[] arr = {1,1,2};
        System.out.println(l.removeDuplicates(arr));
    }

}


//MineFisrt
class LL{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Declare the head variable


    //first add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //add at index
    public void addAtIndex(int index, int data){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void reverse(){
        Node curr = head;
        Node pre = null;
        Node next = null;
        while(curr !=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.addFirst(50);
        l.addFirst(60);
        l.addFirst(70); 
        l.addLast(80);
        l.addLast(90);
        l.addLast(100);
        l.addAtIndex(3, 25);
        l.addAtIndex(5, 35);
        l.addAtIndex(7, 45);
        l.print();
        l.reverse();
        System.out.println();
        l.print();
    }
}