class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int min=Integer.MAX_VALUE;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l++;
            }else{
                min=Math.min(min,nums[mid]);
                    r=mid;
                
            }
        }
        return min;
    }
}