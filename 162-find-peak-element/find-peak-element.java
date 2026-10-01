class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
       for(int i=0;i<nums.length;i++){
        int left=(i==0)?Integer.MIN_VALUE:nums[i-1];
        int right=(i==nums.length-1)?Integer.MIN_VALUE:nums[i+1];
            if(nums[i]>left && nums[i]>right){
                return i;
                // break;
            }
       }
       return 0;
    //    while(l<r){
    //     int mid=l+(r-l)/2;
    //     if(nums[mid]>nums[mid+1]){
    //         r=mid;
    //     }else{
    //         l=mid+1;
    //     }
    //    }
    //    return l;
    }
}