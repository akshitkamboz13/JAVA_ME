import java.util.*;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int arr2[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int arr3[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr4[] = new int[n];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = sc.nextInt();
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        sc.close();
    }
    
}

//foreach loop
class forEachLoop {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);

        }
    }
}

//make duplicate array
class duplicateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

//find duplicate
class duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }
        }
    }
}

//write a program to to write a array in reverse order
class reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
//write a program to print element at even index
class evenIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
//largest element in array
class largestElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
    }
}
//sum of all items
class sumofitems {
    public static void main(String[] args) {
        int arr[]= { 1,2,3,8,5};
        int sum =0 ;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

//sorting
class sorting {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//sarching algorithm are use to find the element in the array 
//these algotihms are widely used in the computer science and are crucial for the task like searching for perticular record in the database, finding the element in a sorted list or locating a file in a computer.
//types of searching algorithms
//1. Linear search - in this simple algo each element in the collection is sequentially checked until the desired element is found or all the elements have been checked. O(n) time complexity
 class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 3;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
//2. Binary search - this algorethm is applicable only on the sorted array and list. It repeatedly compares the middle element of the array with the target value and narrow down the search interval by half based on comparison result. O(log n) time complexity.


class binarySearch{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 4;
        int low = 0;
        int high = arr.length-1;
        int mid = high/2;
        while(low<=high){
            if(arr[mid]== x){
                System.out.println("Element found at index: "+mid);
                return;
            }
            if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
            mid = (low+high)/2;
        }   
     }
}

class linearSearchByMe {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 5;
        for (int i = 0; i <= arr.length/2; i++) {
            if(arr[i] == x){
                System.out.println("Element found at index: "+i);
                return;
            }
            if(arr[arr.length-1-i] == x && arr.length - 1 - i != i){
                System.out.println("Element found at index: "+(arr.length - 1 - i));
                return;
            }
        }
        System.out.println("Element not found");
    }
}

//selection sort
class selectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        for (int i =0; i<arr.length; i++){
            int min = i;
            int j;
            for(j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//insertion sort is a simple sorting algorithm that works by iteratively inserting each element of unsored array into its correct position in the sorted portion of the array.
//It is a stable sorting algorithm meaning that element with equal value mentain their relative order in a sorted array(output).
//time complexity of insertion sort is O(n^2) in worst case and O(n) in best case.
//space complexity of insertion sort is O(1)
class insertionSort{
    public static void main(String[] args) {
        int arr[]={4,3,5,2,1};
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current/*arr[i]*/){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//bubble sort
class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//quick sort
class quickSortSol {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class quickSortPractice{
    public static void main(String[] args){
        int arr[]={4,5,6,1,2,3};
        quickSort(arr,0,arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int arr[],int low, int high){
        if(low<high){
            int pind = partition(arr,low,high);
            quickSort(arr, low, pind-1);
            quickSort(arr, pind+1, high);
        }
    }
    public static int partition(int[] arr, int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            
            if(arr[j]<= pivot){
                i++; 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}

//merge sort
//It is a sorting algorithm that follows the divide and conquer approch. It works by recursively dividing the input array into a smaller sub array and sorting those arrays and then merging them back together to get the final sorted array. 
//Time complexity of merge sort is O(n log n) in all the cases.
//Space complexity of merge sort is O(n)
class mergeSortSol {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}