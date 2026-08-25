class Solution {
    public int check(int i,int[] stoneValue,int dp[]){
        if(i>=stoneValue.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int res=Integer.MIN_VALUE;
         res=Math.max(res,stoneValue[i]-check(i+1,stoneValue,dp));
        if(i+1<stoneValue.length){
            res=Math.max(res,stoneValue[i]+stoneValue[i+1]-check(i+2,stoneValue,dp));
        }
        if(i+2<stoneValue.length){

            res=Math.max(res,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-check(i+3,stoneValue,dp));
        }
        return dp[i]= res;
    }
    public String stoneGameIII(int[] stoneValue) {
        int dp[]=new int[stoneValue.length];
        Arrays.fill(dp,-1);
        int ans=check(0,stoneValue,dp);
        if(ans>0){
            return "Alice";
            
        }else if(ans<0){
            return "Bob";
        }else{
            return "Tie";
        }
    }
}