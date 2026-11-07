class Solution {
    public int check(int i,int[] arr,int k,int dp[]){
        if(i>=arr.length){
            return 0;

        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int max=0;
        int ans=0;
        int len=0;
        for(int j=i;j<Math.min(arr.length,i+k);j++){
            len++;
            max=Math.max(max,arr[j]);
            ans=Math.max(ans,max*len+check(j+1,arr,k,dp));
        }
        return dp[i] = ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return check(0,arr,k,dp);
    }
}