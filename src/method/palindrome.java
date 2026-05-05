package method;

import java.util.Scanner;

public class palindrome {
   public static boolean pal(int n){
       int Num = n;
       int reverse = 0;
       while(n!=0){
           int rem = n%10;
           reverse = reverse*10+rem;
           n/=10;
       }
       if (reverse==Num){
           return true;
       }
       return false;
   }
    public static void main(String[] args) {
        System.out.println("enter num : ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(pal(n)){
           System.out.println("number is palindrone");
       }else System.out.println("not palidrone");
    }
}
