package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<nums.size()-1; i++){
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) +1 < nums.get(i+1)){
                list.add(nums.get(i));
            }
        }

        // list me 1 hi number ho
        if(nums.size() == 1){
            list.add(nums.get(0));
        }

        if(nums.size() > 1){
            // 1st element
            if(nums.get(0) + 1 < nums.get(1)){
                list.add(nums.get(0));
            }
            // last element
            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(5);
        nums.add(6);
        nums.add(10);
        System.out.println(findLonely(nums));
    }
}
