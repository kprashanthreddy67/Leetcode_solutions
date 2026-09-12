class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.get(val)>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}