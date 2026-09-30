class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int left=(i==0)?Integer.MIN_VALUE:nums[i-1];
            int right=(i==nums.length-1)?Integer.MIN_VALUE:nums[i+1];
            if(val>left && val>right){
                return i;
            }
        }
        return 0;
        // while(l<=r){
        //     int mid=l+(r-l)/2;

        // }
    }
}