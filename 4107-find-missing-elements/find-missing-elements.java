class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
            if(nums[i]<small){
                small=nums[i];
            }
        }
        List<Integer>ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int i=0;
        int num=small;
        while(num<large){
            if(!hs.contains(num)){
                ans.add(num);
            }
            num++;
        }
        return ans;
    }
}