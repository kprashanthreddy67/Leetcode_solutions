class Solution {
    public boolean check(int i,int nums[] ,int sum,int dp[][]){
        if(i==0){
            return nums[0]==sum;
        }
        if(sum==0){
            return true;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum]==1;
        }
        boolean not = check(i-1,nums,sum,dp);
        boolean take=false;
        if(sum>=nums[i]){
            take=check(i-1,nums,sum-nums[i],dp);
        }
        dp[i][sum]=(not || take)?1:0;
        return not|| take;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int dp[][]=new int[nums.length][sum/2+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
       return  check(nums.length-1,nums,sum/2,dp);
    }
}