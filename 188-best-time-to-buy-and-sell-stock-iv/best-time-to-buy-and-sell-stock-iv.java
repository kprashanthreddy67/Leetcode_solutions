class Solution {
    public int check(int i,int buy,int k,int prices[],int dp[][][]){
        if(i==prices.length || k<=0){
            return 0;
        }
        if(dp[i][buy][k]!=-1){
            return dp[i][buy][k];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[i]+check(i+1,0,k,prices,dp),0+check(i+1,1,k,prices,dp));
        }else{
            profit=Math.max(prices[i]+check(i+1,1,k-1,prices,dp),0+check(i+1,0,k,prices,dp));
        }
        return dp[i][buy][k]=  profit;
    }
    public int maxProfit(int k, int[] prices) {
        int dp[][][]=new int[prices.length][2][k+1];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<=1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return check(0,1,k,prices,dp);
    }
}