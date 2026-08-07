class Solution {
    public int check(int i,int buy,int prices[],int dp[][]){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[i]+check(i+1,0,prices,dp),0+check(i+1,1,prices,dp));
        }else{
            profit=Math.max(prices[i]+check(i+1,1,prices,dp),0+check(i+1,0,prices,dp));
        }
        return dp[i][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return check(0,1,prices,dp);
    }
}