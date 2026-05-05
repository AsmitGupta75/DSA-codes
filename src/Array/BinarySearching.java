package Array;

public class BinarySearching {
    public static int binarySearch(int number[], int key){
        int start = 0, end = number.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            // comparesion
            if( number[mid] == key){ // Found
                return mid;
            }
            if(number[mid] < key){ // Right
                start = mid +1;
            }else end = mid - 1;   // left
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 14;
        System.out.println("Index for key is : " +binarySearch(numbers,key));
    }
}
