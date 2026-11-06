class Solution {
    public int check(int i,int buy,int con,int[] prices,int dp[][][]){
        if(i>=prices.length || con<=0){
            return 0;
        }
        if(dp[i][buy][con]!=-1){
            return dp[i][buy][con];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[i]+check(i+1,0,con,prices,dp),0+check(i+1,1,con,prices,dp));
        }else{
            profit=Math.max(prices[i]+check(i+1,1,con-1,prices,dp),0+check(i+1,0,con,prices,dp));
        }
        return dp[i][buy][con] = profit;
    }
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return check(0,1,2,prices,dp);

    }
}