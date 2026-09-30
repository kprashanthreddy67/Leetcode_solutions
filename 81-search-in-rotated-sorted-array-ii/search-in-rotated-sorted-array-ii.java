class Solution {
    public boolean search(int[] nums, int target) {
        // int l=0;
        // int r=nums.length-1;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]==target){
        //         return true;
        //     }else if(nums[l]<=nums[mid]){
        //         if(nums[l]<=target && target<=nums[mid]){
        //             r--;
        //         }else{
        //             l++;
        //         }
        //     }else{
        //         if(nums[mid]<=target && target <= nums[r]){
        //             l++;
        //         }else{
        //             r--;
        //         }
        //     }
        // }
        // return false;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:hs){
            ans.add(i);
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==target){
                return true;
            }
        }
        return false;
    }
}