package Arraylist;

import java.util.ArrayList;

public class BeautifulArraylist {
    public static ArrayList<Integer> beautiful(int n){
        ArrayList<Integer> res = new ArrayList<>();
       divideConque(1,1,res,n);
       return res;
    }
    private static void divideConque(int start, int inc, ArrayList<Integer> res, int n){
        if(start+inc > n){
            res.add(start);
            return;
        }
        divideConque(start,2*inc,res,n);
        divideConque(start+inc,2*inc,res,n);
    }
    public static void main(String[] args) {
        System.out.println(beautiful(5));
    }
}
