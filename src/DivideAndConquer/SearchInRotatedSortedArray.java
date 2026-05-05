package DivideAndConquer;

public class SearchInRotatedSortedArray {
    public static int SearchArray(int arr[], int target, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }
        // case 1: L1
        if(arr[si] <= arr[mid]){
            // case a;
            if(arr[si] <= target && target <= arr[ei]){
                return SearchArray(arr,target,si,mid-1);
            }
            // case b;
            else {
                return SearchArray(arr,target,mid+1,ei);
            }
        }
        // case 2: L2
        else {
            if(arr[mid] <= target && target<= arr[ei]){
                return SearchArray(arr, target,mid+1, ei);
            }else {
                return SearchArray(arr, target,si,mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,0,1,2};
        System.out.println(SearchArray(arr,0,0,arr.length-1));
    }
}
