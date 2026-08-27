class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            // hs.add(nums[r]);
            if(r-l<=k){
                if(hs.contains(nums[r])){
                    return true;
                }else{
                    hs.add(nums[r]);
                    
                }
            }
            if(r-l>=k){
                hs.remove(nums[l]);
                l++;
            }
        }
        return false;
    }
}