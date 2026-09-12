class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int ans=0;
        int mul=1;
        int max=0;
        if(k<=1)return 0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            mul=mul*nums[r];
            while(mul>=k){
                mul=mul/nums[l];
                l++;
            }
            if(mul<k){
                ans+=r-l+1;
                // max=Math.max(max,ans);
            }
        }
        return ans;
    }
}