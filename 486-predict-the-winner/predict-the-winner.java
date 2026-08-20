class Solution {

    public int check(int i,int j,int[] nums,int dp[][]){
        if(i==j){
            return nums[i];

        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        // int left=nums[i]-check(i+1,j,nums);
        // int right=nums[j]-check(i,j-1,nums);
        // return Math.max(left,right);
        return dp[i][j]= Math.max(nums[i]-check(i+1,j,nums,dp),nums[j]-check(i,j-1,nums,dp));
    }
    public boolean predictTheWinner(int[] nums) {
        int dp[][]=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=check(0,nums.length-1,nums,dp);
        if(ans<0){
            return false;
        }
        return true;
    }
}