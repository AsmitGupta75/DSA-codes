package Sorting;

public class SelectionSort {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int Min = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[Min] > arr[j]){
                    Min = j;
                }
            }
            int temp = arr[Min];
            arr[Min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        selection(arr);
        printArray(arr);
    }
}
