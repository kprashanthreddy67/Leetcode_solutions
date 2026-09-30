class Solution {
    public int check(int[] nums,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k){
                int val1=nums[l];
                hm.put(val1,hm.get(val1)-1);
                if(hm.get(val1)==0){
                    hm.remove(val1);
                }
                l++;
            }
            cnt+=i-l+1;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }
}