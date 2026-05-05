package Array;

public class BruteForce {
    public static void maxSubArraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++ ){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    //sub array sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if( maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum ; "+maxSum );
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}
