package Recursion;

public class Basics {
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    public static int fact(int n ){
        if(n==0){
            return 1;
        }
       // int factN_1 = fact(n-1);
        int factN = n * fact(n-1);
        return factN;
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int SNm1 = sum(n-1);
        int SN = n + SNm1;
        return SN;
    }

    public static int fib(int n){
        if(n == 0 || n == 1) return n;

        int fibNm1 = fib(n-1);
        int fibNm2 = fib(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0) return 1;
        return x * power(x,n-1);
    }

    public static int optimizedPower(int x, int n){
        if(n == 0) return 1;
        int HalfPower = optimizedPower(x,n/2);
        int HalfPowerSq = HalfPower * HalfPower;
        if(n%2 != 0){
            return x*HalfPowerSq;
        }
        return HalfPowerSq;
    }

    public static void main(String[] args) {
        // #1 Print number from n to 1 (decreasing order);
        // printDec(10);

        // #2 print number from 1 to n (increasing order);
        // printInc(5);

        // #3 print factorial of a number n;
        // System.out.println(fact(5));

        // #4 print sum of N natural number;
        // System.out.println(sum(5));

        // #5 print Nth fibonacci number;
        // System.out.println(fib(21));

        // #6 check if a given Array is sorted or not;
        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr,0));

        // #7 waf to find the first occurnece of an element in an array;
        // int arr[] = {1,2,3,4,5};
        // System.out.println(firstOccurence(arr,3,0 ));

        // #8 waf to find the last occurence of an element in an array;
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr,5,0));

        // #9 power x^n
        System.out.println(power(2,10));

        // #10 power x^n [O(log n)]
        System.out.println(optimizedPower(2,10));


    }
}
