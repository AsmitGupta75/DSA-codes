package DivideAndConquer;

//  Given an array nums of size n, return the majority element.

public class practiceQuestion2 {
    public static void quick(int[] arr, int si , int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si ,ei);
        quick(arr,si,pIdx-1);
        quick(arr,pIdx+1,ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot ){
                i++;
                int temp = arr[j];
                arr[j]  = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,2,2,2,2,2};
            quick(arr,0,arr.length-1);
        System.out.println(arr[arr.length/2]);
    }

}
