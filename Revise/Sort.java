package Revise;

public class Sort {

}

//Bubble Sort
class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int p : arr){
            System.out.print(p+ " ");
        }
    }
}

//Selection Sort
class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int smallest = 0;
        int indx = 0;
        for(int i=0;i<arr.length;i++){
            smallest = arr[i];
            indx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<smallest){
                    smallest = arr[j];
                    indx = j;
                }
            }
            arr[indx] = arr[i];
            arr[i] = smallest;
        }
        for(int i : arr){
            System.out.print(i);
        }
    }
}


//Insertion sort
class InsertionSort{
    public static void main(String[] args) {
        int[] arr={7,8,3,2,1};
        //3 7 8

        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = curr;
            
        }
        for (int i : arr) {

            System.out.print(i + " ");
        }
    }
}

//Quick Sort
class QuickSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        quickSort(arr, 0, arr.length-1);
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}


//Merge Sort
class MergeSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        mergeSort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int[] arr, int low, int mid, int high){
      int[] srr = new int[high+low+1];
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                srr[k] = arr[i];
                i++;
            }else{
                srr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            srr[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high){
            srr[k] = arr[j];
            j++;
            k++;
        }
        for(int p = low; p<=high; p++){
            arr[p] = srr[p];
        }
    }
}

//Heap Sort
class HeapSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        heapSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i = n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i = n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n, int i){//arr,4,0  
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
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
}
