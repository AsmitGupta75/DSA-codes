package DynamicProgramming;

public class CoinChange {
    public static int coinChange(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i< dp.length; i++){ //0th col val
            dp[i][0] = 1;
        }
        for(int j=0; j<dp.length; j++) {//0th row val
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1] <= j){//valid
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }else { //invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int sum = 4;
        System.out.println(coinChange(coins,sum));
    }
}
