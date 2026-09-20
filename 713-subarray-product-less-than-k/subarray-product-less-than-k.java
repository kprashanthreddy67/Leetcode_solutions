class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int mul=1;
        int l=0;
        int cnt=0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            mul=mul*val;
            while(mul>k){
                mul=mul/nums[l];
                l++;
            }
            if(mul<k){
                cnt+=r-l+1;
            }
        }
        return cnt;
    }
}