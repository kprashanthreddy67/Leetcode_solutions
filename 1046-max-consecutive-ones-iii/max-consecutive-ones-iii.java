class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt=0;
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]==0){
                    cnt-=1;
                   
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return  max;
    }
}