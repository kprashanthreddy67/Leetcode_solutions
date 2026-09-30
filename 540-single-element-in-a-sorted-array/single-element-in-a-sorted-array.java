class Solution {
    public int singleNonDuplicate(int[] nums) {
        //optimal
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                return i;
            }
        }
        return -1;
        // if(nums.length==1) return nums[0];

        // if(nums[0]!=nums[1]) return nums[0];
        // if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        // int l=1;
        // int r=nums.length-2;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
        //         return nums[mid];
        //     }else if(mid%2==1 && nums[mid]==nums[mid-1] || mid%2==0 && nums[mid]==nums[mid+1]){
        //         l=mid+1;
        //     }else{
        //         r=mid-1;
        //     }
        // }
        // return -1;
        //brute force

        // if(nums.length==1) return nums[0];
        // for(int i=0;i<nums.length;i++){
        //     if(i==0){
        //         if(nums[i]!=nums[i+1]) return nums[i];
        //     }else if(i==nums.length-1){
        //         if(nums[i]!=nums[i-1]){
        //             return nums[i];
        //         }
        //     }else{
        //         if(nums[i]!=nums[i+1] &&  nums[i]!=nums[i-1]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
    }
}