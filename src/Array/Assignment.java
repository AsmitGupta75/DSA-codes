package Array;

import java.util.HashSet;

public class Assignment {
    public static boolean containDuplicate(int nums[]){

        // contain duplicate value brute force approach O(n^2)
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // contain duplicate value using hashset O(n)
    public static boolean containDuplicateHash(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else set.add(nums[i]);
        }
        return false;
    }

    // calculate max profit
    public static int maxProfit(int price[]){
        int buy = price[0];
        int profit = 0;
        for(int i=0; i<price.length; i++){
            if(buy < price[i]){
                profit = Math.max(price[i]-buy,profit);
            }else buy = price[i];
        }
        return profit;
    }

    // search in rotate array
    public static int search(int arr[], int target){
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target ){
                if(target < arr[mid] && target >= lo){
                    hi = mid - 1;
                }else lo = mid + 1;
            }
            else if(arr[mid] < target) {
                if(target > arr[mid] && target < hi){
                    lo = mid + 1;
                }else hi = mid - 1;
            }
        }
        return -1;
    }

    // trap water using two pointer
    public static int trap(int height[]){
        int n = height.length;
        int trappedWater = 0, l=0, r= n-1;
        int lMax = height[l], rMax = height[r];

        while(l < r){
            if (lMax<rMax){
                l++;
                lMax = Math.max(lMax,height[l]);
                trappedWater += lMax - height[l];
            }else {
                r--;
                rMax = Math.max(rMax,height[r]);
                trappedWater += rMax - height[r];
            }
        }
        return trappedWater;
    }




    public static void main(String[] args) {
        int nums[] = {4,5,6,7};
        System.out.println(containDuplicate(nums));
        System.out.println(containDuplicateHash(nums));

        int price[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));

        int arr[] = {4,5,6,7,8,1,2};
        int target = 1;
        System.out.println(search(arr, target));

        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));


    }
}
