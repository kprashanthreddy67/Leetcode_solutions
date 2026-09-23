class Solution {
    public void reverse(int[] nums,int l,int r){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }

        }
        reverse(nums,pivot+1,nums.length-1);
    }
}