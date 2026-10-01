class Solution {
    public boolean ispossible(int[] nums,int k,int m){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(nums[i]>m){
                return false;
            }
            if(temp+val>m){
                k--;
                temp=0;

            }
            temp+=val;
            if(k<=0){
            return false;
            }
        }
        return true;
        
    }
    
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i:nums){
            r=r+i;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(nums,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}