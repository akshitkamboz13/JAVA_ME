package Revise;

public class Sort {

}

//Bubble Sort
class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        int i = arr.length-1;
        while(i>0){
            for(int j=0; j<i;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
            i--;
        }
        for(int p : arr){
            System.out.print(p);
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

//Binary Search
