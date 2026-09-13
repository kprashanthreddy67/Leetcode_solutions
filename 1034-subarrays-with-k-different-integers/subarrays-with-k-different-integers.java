class Solution {
    public int check(int[] nums,int k){
         HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k){
                int val1=nums[l];
                hm.put(val1,hm.get(val1)-1);
                if(hm.get(val1)==0){
                    hm.remove(val1);
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