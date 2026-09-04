class Solution {
    public int firstStableIndex(int[] nums, int k) {

     for(int i=0;i<nums.length;i++){
        int max=0;;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<=i;j++){
            max=Math.max(max,nums[j]);
        }
        for(int j=i;j<nums.length;j++){
            min=Math.min(min,nums[j]);
        }
        int ans=max-min;
        if(ans<=k){
            return i;
        }
     }   
     return -1;
    }
}