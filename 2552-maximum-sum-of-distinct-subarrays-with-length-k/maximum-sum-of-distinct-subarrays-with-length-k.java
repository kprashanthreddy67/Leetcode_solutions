class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       
        int l=0;
        long sum=0;
        long max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();    
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            sum+=val;
            hm.put(val,hm.getOrDefault(val,0)+1);
            if(r-l+1>k){
                sum-=nums[l];
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            if(hm.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}