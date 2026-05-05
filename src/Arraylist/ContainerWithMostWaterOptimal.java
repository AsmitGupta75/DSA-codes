package Arraylist;

import java.util.ArrayList;

public class ContainerWithMostWaterOptimal {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int Lp = 0;
        int Rp = height.size()-1;

        while(Lp < Rp){
            // calculate water area
            int ht = Math.min(height.get(Lp),height.get(Rp));
            int width = Rp - Lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);

            // update ptr;
            if(height.get(Lp) < height.get(Rp)){
                Lp++;
            }else{
                Rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
