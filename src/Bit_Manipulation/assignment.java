package Bit_Manipulation;

public class assignment {
    public static void main(String[] args) {
        // #1 swap without using third variable
        int a = 2, b= 3;
        System.out.println("before swaping : " +a+ "," +b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swaping :"+a+ ","+b);

        // #2 : Add 1 to an integer using Bit Manipulation. ~0 = -1
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);

        // #3
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print((char) (ch | ' '));
        }


    }
}
