class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0;
        long ans=0;
        int cnt=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            if(val==max){
                cnt++;
            }
            while(cnt>=k){
                if(nums[l]==max){
                    cnt--;
                }
                l++;
            }
            ans+=l;
        }
        return ans;
    }
}