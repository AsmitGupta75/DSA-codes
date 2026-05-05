package Bit_Manipulation;

public class BitManipulation {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else System.out.println("odd number");
    }


    public static int getIthBit(int n, int i){
        int bitMast = 1<<i;
        if((n & bitMast) == 0) return 0;
        else return 1;
    }


    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }


    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    public static int updateIthBit(int n, int i, int newBit){
//        if(newBit == 0){
//            return clearIthBit(n,i);
//        }else return setIthBit(n,1);

        n = clearIthBit(n,i);
        int bitmask = newBit << i;
        return n |  bitmask;
    }


    public static int clearLastIthBit(int n, int i){
        int BitMask = (~0)<<i;  // or (-1)<<i;
        return n & BitMask;
    }


    public static int clearBitInRange(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }


    public static boolean isPowerOfTwo(int n){
       return (n & n-1) == 0;
    }


    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if ((n & 1) != 0) count++;  // check LSB
            n = n>>1;
        }
        return count;
    }

    public static int fastExponetiation(int a, int n){
        int ans = 1;
        while (n>0){
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }


    public static long modularExponetiation(long a, long n,long mod){
        long ans = 1;
        a = a % mod;
        while (n>0){
            if((n&1) != 0){
                ans = (ans * a) % mod;
            }
            a = (a*a) % mod;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        // #1
//        System.out.println(5&6);
//        System.out.println(5|6);
//        System.out.println(5^6);
//        System.out.println(~5+" "+~0);
//        System.out.println(5<<2);
//        System.out.println(6>>1);
//
//        // #2
//        oddEven(3);
//        oddEven(2);
//
//        // #3
//        System.out.println(getIthBit(10,2));
//
//        // #4
//        System.out.println(setIthBit(10,2));
//
//        // #5
//        System.out.println(clearIthBit(10,1));
//
//        // #6
//        System.out.println(updateIthBit(10,2,0));
//
//        // #7
//        System.out.println(clearLastIthBit(15,2));
//
//        // #8
//        System.out.println(clearBitInRange(10,2,4));
//
//        // #9
//        System.out.println(isPowerOfTwo(15));
//
//        // #10
//        System.out.println(countSetBit(15));
//
//        // # 11
//        System.out.println(fastExponetiation(5,3));

        // # 12
        System.out.println(modularExponetiation(3,13,100));


    }
}
