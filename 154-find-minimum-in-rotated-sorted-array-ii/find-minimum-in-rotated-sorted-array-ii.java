class Solution {
    public int findMin(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int min=Integer.MAX_VALUE;

        for(int i:hs){
            min=Math.min(min,i);
        }
        return min;

        // int l=0;
        // int min=Integer.MAX_VALUE;
        // int r=nums.length-1;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[l]<=nums[mid]){
        //         min=Math.min(min,nums[l]);
        //         l++;
        //     }else{
        //         min=Math.min(min,nums[mid]);
        //             r=mid-1;
                
        //     }
        // }
        // return min;
    }
}