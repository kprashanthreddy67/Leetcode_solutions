class Solution {
    public int check(int[] nums,int k){
         int cnt=0;
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1){
                cnt++;

            }
            while(cnt>k){
                if(nums[l]%2==1){
                    cnt--;
                }
                l++;
            }
            max+=r-l+1;
        }
        return max;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return check(nums,k)-check(nums,k-1);
    }
}