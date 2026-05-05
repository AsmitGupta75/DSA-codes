package method;

public class Method {
    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binomial(int n , int r ){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        return a/(b*c);
    }
    public static void main(String[] args) {
        System.out.println(binomial(5,5));
    }
}
