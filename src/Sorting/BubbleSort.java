package Sorting;
// Optimized java implementation of Bubble sort
import java.io.*;

class BubbleSort {
        public static void bubble( int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++){
            swapped = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void Print(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ ",");
            }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3};
        bubble(arr);
        Print(arr);
    }
}