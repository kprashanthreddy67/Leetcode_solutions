class Solution {
    public int check(int[]nums,int k){
        int l=0;
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int r=0;r<nums.length;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }
}