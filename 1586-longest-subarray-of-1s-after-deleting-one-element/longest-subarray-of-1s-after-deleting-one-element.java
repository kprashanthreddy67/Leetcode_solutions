class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int max=0;
        int cnt=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>1){
                int num=nums[l];
                if(num==0){
                    cnt--;
                }
                l++;
            }
            max=Math.max(max,r-l);

        }
        return max;
    }
}