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


