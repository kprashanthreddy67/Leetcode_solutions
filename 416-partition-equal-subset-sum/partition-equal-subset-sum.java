class Solution {
    public boolean check(int i,int nums[],int target,int dp[][]){
        if(target==0){
            return true;
        }
        if(i==0){
            return nums[0]==target;
        }
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
        }
        boolean not=check(i-1,nums,target,dp);
        boolean take=false;
        if(target>=nums[i]){
            take=check(i-1,nums,target-nums[i],dp);
        }
        dp[i][target]=(not || take)?1:0;
        return not || take;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum%2)==1){
            return false;
        }
        int target=sum/2;
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return check(nums.length-1,nums,target,dp);
    }
}