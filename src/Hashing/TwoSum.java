package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(num,i);
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
}
