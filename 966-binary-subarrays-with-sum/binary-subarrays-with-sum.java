class Solution {
    public int check(int[] nums,int goal){
        int l=0;
        int max=0;
        int cnt=0;
        if(goal<0){
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            cnt+=nums[r];
            while(cnt>goal){
                if(nums[l]==1){
                    cnt-=1;
                }
                l++;
            }
            max+=r-l+1;
        }
        return max;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
}