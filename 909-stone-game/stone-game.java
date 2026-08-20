class Solution {
    public int check(int i,int j,int[] piles,int dp[][]){
        if(i==j){
            return piles[i];
        }
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take_i=0;
        if(i<piles.length && j>0){
            take_i=piles[i]+Math.min(check(i+2,j,piles,dp),check(i+1,j-1,piles,dp));
        }
        int take_j=0;
        if(i<piles.length && j>0){
            take_j=piles[j]+Math.min(check(i+1,j-1,piles,dp),check(i,j-2,piles,dp));
        }
        return dp[i][j]= Math.max(take_i,take_j);

    }
    public boolean stoneGame(int[] piles) {
        int sum=0;
        for(int num:piles){
            sum+=num;
        }
        int dp[][]=new int[piles.length][piles.length];
        for(int i=0;i<piles.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=check(0,piles.length-1,piles,dp);
        if(ans>sum/2){

            return true;
        }
        return false;
    }
}