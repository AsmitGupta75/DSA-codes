package Array;

import java.util.Scanner;

public class ArrayCC {
    public static void update(int mark[], int nonChangeble){
        nonChangeble = 55;
        for(int i=0; i<mark.length; i++){
            mark[i] += 1;
        }
    }
    public static void main(String[] args) {
//        int mark[] = new int[50];
//        Scanner sc = new Scanner(System.in);
//        mark[0] = sc.nextInt();
//        mark[1] = sc.nextInt();
//        mark[2] = sc.nextInt();
//
//        System.out.println("math : "+mark[0]);
//        System.out.println("math : "+mark[1]);
//        System.out.println("math : "+mark[2]);
//
//        System.out.println("percentage: "+(mark[0]+mark[1]+mark[2])/3);

        // call by Reference
        int mark[] = {99,98,97};
        int nonChangeble = 44;
        update(mark, nonChangeble);
        System.out.println(nonChangeble);

        for(int i=0; i<mark.length; i++){
            System.out.println("marks : " +mark[i]);
        }






    }
}
