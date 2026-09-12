class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int mul=1;
        int cnt=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            mul=mul*nums[r];
            while(mul>k){
                mul=mul/nums[l];
                l++;
            }
            if(mul<k){
                cnt+=r-l+1;
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}