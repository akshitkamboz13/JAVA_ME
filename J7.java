public class J7 {
    
}

//Heap Sort
class HeapSort{
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr){
        int n = arr.length;

        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        printArray(arr);
    }
}

//Properties of Heap Sort
//Time Complexity: O(nlogn)
//Space Complexity: O(1)
//In-place sorting algorithm 
//It is sorting algo use comparison based sorting technique based on binary heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the end. We repeat the same process for the remaining elements.

//Priority Queue
//It is a type of queue that arrange elements in a queue based on their priority. In a priority queue, an element with high priority value arfily retrieved before an element with low priority value. 

