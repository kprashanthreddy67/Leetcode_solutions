class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long minKpos=-1;
        long maxKpos=-1;
        long maxbound=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                maxbound=i;
            }
            if(nums[i]==minK){
                minKpos=i;
            }
            if(nums[i]==maxK){
                maxKpos=i;
            }
            long smaller=Math.min(minKpos,maxKpos);
            long temp=smaller-maxbound;
            if(temp<0){
                ans+=0;
            }else{
                ans+=temp;
            }
            
        }
        return ans;
    }
}