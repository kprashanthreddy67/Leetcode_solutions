class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           hs.add(nums[i]);
        }
        int mul=k;
        while(hs.contains(mul)){
            mul+=k;
        }
        return mul;
    }
}