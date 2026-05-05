package DivideAndConquer;

// Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase).

public class practiceQuestion1 {
    public static void margeSortString(String[] arr, int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si+(ei-si)/2;
        margeSortString(arr,si,mid);
        margeSortString(arr,mid+1,ei);
        marge(arr,si,mid,ei);
    }

    public static void marge(String[] arr, int si , int mid , int ei){
        String[] temp = new String[ei - si +1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i <= mid && j<=ei){
            if(arr[i].compareTo(arr[j]) <= 0){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        margeSortString(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
