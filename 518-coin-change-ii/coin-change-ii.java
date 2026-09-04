class Solution {
    public int check(int i,int coins[],int amount,int dp[][]){
        if(i==0){
            if(amount%coins[0]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int not=check(i-1,coins,amount,dp);
        int take=0;
        if(amount>=coins[i]){
            take=check(i,coins,amount-coins[i],dp);
        }
        return dp[i][amount] = not+take;
    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return check(coins.length-1,coins,amount,dp);
    }
}