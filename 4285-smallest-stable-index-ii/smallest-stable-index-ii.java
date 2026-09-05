class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int minArray[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            minArray[i]=min;
        }
        int max=0;
        int  maxArray[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            maxArray[i]=max;
        }
        for(int i=0;i<nums.length;i++){
            int ans=maxArray[i]-minArray[i];
            if(ans<=k){
                return i;
            }
        }
        return -1;
        // for(int i=0;i<nums.length;i++){
        //     max=Math.max(max,nums[i]);
        //    int min1=minfrom[i];
        //     int ans=max-min1;
        //     if(ans<=k){
        //         return i;
        //     }
        // }
        // return -1;
        //brute force
        // for(int i=0;i<nums.length;i++){
        //     int max=0;
        //     int min=Integer.MAX_VALUE;
        //     for(int j=0;j<nums.length;j++){
        //         max=Math.max(max,nums[j]);
        //     }
        //     for(int j=i;j<nums.length;j++){
        //         min=Math.min(min,nums[j]);
        //     }
        //     int ans=max-min;
        //     if(ans<=k){
        //         return i;
        //     }
        // }
        // return -1;
    }
    
}