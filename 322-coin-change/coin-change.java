class Solution {
    public int check(int i,int[] coins,int amount,int dp[][]){
        if(i==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            return (int)1e9;
        }
          if(dp[i][amount]!=-1){
            return dp[i][amount];
          }
        int not=check(i-1,coins,amount,dp);
        int take=Integer.MAX_VALUE;
        if(amount>=coins[i]){
            take=1+check(i,coins,amount-coins[i],dp);
        }
        return dp[i][amount]= Math.min(not,take);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= check(coins.length-1,coins,amount,dp);
        if(ans>=(int)1e9){
            return -1;
        }
        return ans;
    }
}