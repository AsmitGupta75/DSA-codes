package method;

public class sumOfDigits {
    public static int sumDigit(int n){
        int Sum = 0;
        while(n != 0){
            int rem = n%10;
            Sum += rem;
            n/=10;
        }
        return Sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of digit : " +sumDigit(333));
    }
}
