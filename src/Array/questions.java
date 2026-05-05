package Array;

import java.util.HashMap;

public class questions {
    public static int[] SAE(int []arr){

        for(int i=0 ; i<arr.length; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        return arr;
    }

    public static int[] IntersectionElement(int arr[]){
        int arr2[] = {1,2,3,2};
        int e[] = new int[Math.max(arr.length,arr2.length)];

        int k=0;
        for(int i=0; i<arr.length ; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr[i] == arr2[j]){
                    e[k++] = arr[i];
                    break;
                }
            }
        }

        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = e[i];
        }
        return ans;
    }

    public static void shiftby1(int ar[]){
        int temp = ar[ar.length-1];
        for(int i= ar.length - 1; i>0; i-- ){
            ar[i] = ar[i-1];
        }
        ar[0] = temp;

        }


        static int findMode(int arr[]){
            HashMap<Integer,Integer> freq = new HashMap<>();

            for(int num:arr){
                freq.put(num, freq.getOrDefault(num,0)+1);
            }

            int maxfreq = -1;
            int keyfreq = -1;
            for(int key:freq.keySet()){
                int currentkey = key;
                int currentkeyfreq = freq.get(key);

                if(currentkeyfreq > maxfreq){
                    maxfreq = currentkeyfreq;
                    keyfreq = currentkey;
                }
            }

            return maxfreq;
        }
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6};
//        int i =0;
//        int j= arr.length-1;
//
//        while (i<=j){
//            System.out.print(arr[i]+" ");
//            if(i!=j){
//                System.out.print(arr[j] +" ");
//            }
//            i++;
//            j--;
//        }
//
//        int ar[] = {10,20,30,40,50,60,70};
//        shiftby1(ar);
//        for(int s:ar){
//            System.out.print(s+" ");
//        }
//        System.out.println();

        int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,7,7};

        System.out.println(findMode(arr));



    }
}
