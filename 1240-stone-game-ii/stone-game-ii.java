class Solution {
    public int check(int i,int person,int m,int[]piles,int dp[][][]){
        if(i>=piles.length){
            return 0;
        }
        if(dp[i][person][m]!=-1){
            return dp[i][person][m];
        }
        int stones=0;
        int res=(person==1)?-1:Integer.MAX_VALUE;
        for(int x=1;x<=Math.min(2*m,piles.length-i);x++){
            stones+=piles[i+x-1];
            if(person==1){
                res=Math.max(res,stones+check(i+x,0,Math.max(x,m),piles,dp));
            }else{
                res=Math.min(res,check(i+x,1,Math.max(x,m),piles,dp));
            }
        }
        return dp[i][person][m]= res;
    }
    public int stoneGameII(int[] piles) {
        int dp[][][]=new int[piles.length][2][piles.length+1];
        for(int i=0;i<piles.length;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return check(0,1,1,piles,dp);
    }
}