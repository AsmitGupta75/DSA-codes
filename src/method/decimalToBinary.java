package method;

public class decimalToBinary {
    public static void decToBin( int n ){
        int my = n;
        int pow = 0;
        int bin = 0;
        while(n>0){
             int rem = n%2;
             bin = bin + (rem*(int)Math.pow(10,pow));
             pow++;
             n=n/2;
        }
        System.out.println("Bin of "+my+" = "+bin);
    }
    public static void main(String[] args) {
        decToBin(5);
    }
}
