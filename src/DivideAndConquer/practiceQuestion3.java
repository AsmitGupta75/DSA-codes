package DivideAndConquer;

// Given an array of integers. Find the Inversion Count in the array.
public class practiceQuestion3 {
//    public static void printArr(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
public static int mergeSort(int arr[], int si, int ei){
    // base case
    if(si >= ei){
        return 0;
    }
    // kaam
    int mid = si+(ei-si)/2;
     int leftInvCount = mergeSort(arr,si,mid); // left part
     int rightInvCount = mergeSort(arr,mid+1,ei); // right part
    int InvCount = merge(arr,si,mid,ei);

    return leftInvCount+rightInvCount+InvCount;
}

public static int merge(int arr[],int si, int mid , int ei){
    int temp[] = new int[ei-si+1];
    int i = si; // iterator for left part
    int j= mid+1; // iterator for right part
    int k = 0; //iterator for temp arr
    int invCount = 0;
    while(i<=mid && j<=ei){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        }else {
            temp[k] = arr[j];
            j++;
            invCount += mid-i+1;
        }
        k++;
    }
    // left part
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    // right part
    while(j<=ei){
        temp[k++] = arr[j++];
    }

    // copy temp to original arr
    for(k=0,i=si; k<temp.length; k++,i++ ){
        arr[i] = temp[k];
    }
    return invCount;
}

public static void main(String[] args) {
    int arr[] = {3,2,5,6,8,9,7};
    System.out.println(mergeSort(arr,0,arr.length-1));
}
}
