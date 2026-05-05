package Sorting;
import java.util.*;

import static java.util.Arrays.*;

public class InbuiltSorti {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void printArray(Integer arr1[]){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        Integer arr1[] = {5,2,3,4,1};
        Arrays.sort(arr,0,3);
        printArray(arr);
        //Arrays.sort(arr1,Collections.reverseOrder());
        Arrays.sort(arr1,0,3,Collections.reverseOrder());
        printArray(arr1);
    }
}
