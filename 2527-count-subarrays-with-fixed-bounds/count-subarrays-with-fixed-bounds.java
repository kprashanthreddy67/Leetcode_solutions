class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long minKpos=-1;
        long maxKpos=-1;
        long maxBound=-1;
        long ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]<minK || nums[r]>maxK){
                maxBound=r;
            }
            if(nums[r]==minK){
                minKpos=r;
            }
            if(nums[r]==maxK){
                maxKpos=r;
            }
            long smallest=Math.min(maxKpos,minKpos);
            long temp=smallest-maxBound;
            if(temp<0){
                ans+=0;
            }else{
                ans+=temp;
            }
        }
        return ans;
    }
}