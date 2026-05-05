package Sorting;

public class Assignment {
    public static void bubbleSort(int arr[]){
        boolean swap;
        for(int i=0; i<arr.length-1; i++){
            swap = false;
            for(int j=0; j<arr.length-1-i; j++ ){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false) break;
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int Max=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[Max] < arr[j]){
                    Max = j;
                }
            }
            int temp = arr[Max];
            arr[Max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3};
        // bubbleSort(arr);
        // selectionSort(arr);

        insertionSort(arr);
        printArray(arr);
    }
}
