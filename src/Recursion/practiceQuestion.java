package Recursion;

import java.util.Scanner;

public class practiceQuestion {

    static String Digits[] = {"zerp","one","two","three", "four", "five", "six", "seven", "eight", "nine"};

    public static void allOccurrencesIdx(int arr[] , int i, int key){
        if(i == arr.length){
            return ;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurrencesIdx(arr,i+1,key);

    }

    public static void printDigits(int number){
      if(number==0){
          return;
      }
      int lastdigit = number%10;
      printDigits(number/10);
      System.out.println(Digits[lastdigit]+" ");
    }

    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static void toh(int n, char t1, char t2, char t3){
        if(n==0)return;
        toh(n-1,t1,t3,t2);
        System.out.println(n+"["+ t1 +" -> "+t2+"]");
        toh(n-1,t3,t2,t1);
    }

    public static int countSubstring(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int res = countSubstring(str,i+1,j,n-1)+ countSubstring(str,i,j-1,n-1)-countSubstring(str,i+1,j-1,n-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }

        return res;

    }


    public static void main(String[] args) {
        //#1
//        int arr[] = {1,2,2,3,3,5,2};
//        allOccurrencesIdx(arr,0,2);

        //#2
//        printDigits(123);

        //#3
//        String str = "abcde";
//        System.out.println(length(str));

        //#4  tower of honoi
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        toh(n,'A','B','C');

        //#5
        String str = "aba";
        int n = str.length();
        System.out.println(countSubstring(str,0,n-1,n));




    }
}
