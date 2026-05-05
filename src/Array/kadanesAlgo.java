package Array;

public class kadanesAlgo {
    public static void maxSubArraySum(int numbers[]){
        int maxSum = numbers[0];
        int curSum = numbers[0];

        for (int i=0;  i<numbers.length; i++){
            curSum = Math.max(numbers[i],curSum+numbers[i]);
            maxSum = Math.max(curSum,maxSum);
        }
        System.out.println("max sum ; "+maxSum);

    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySum(numbers);
    }
}
