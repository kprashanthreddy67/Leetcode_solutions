class Solution {
    public int check(int i,int buy,int cap,int[] prices,int dp[][][]){
        if(i==prices.length || cap<=0){
            return 0;
        }
        if(dp[i][buy][cap]!=-1){
            return dp[i][buy][cap];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[i]+check(i+1,0,cap,prices,dp),0+check(i+1,1,cap,prices,dp));
        }else{
            profit=Math.max(prices[i]+check(i+1,1,cap-1,prices,dp),0+check(i+1,0,cap,prices,dp));
        }
        return dp[i][buy][cap] = profit;
    }
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++){
             for(int j=0;j<=1;j++){
                Arrays.fill(dp[i][j],-1);
             }
        }
        return check(0,1,2,prices,dp);
    }
}