class Solution {
    public int check(int[] nums,int goal){
        int l=0;
        int sum=0;
        int cnt=0;
        int ans=0;
        if(goal<0) return 0;
         for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                cnt++;
            }
            while(cnt>goal){
                if(nums[l]==1){
                    cnt--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
}