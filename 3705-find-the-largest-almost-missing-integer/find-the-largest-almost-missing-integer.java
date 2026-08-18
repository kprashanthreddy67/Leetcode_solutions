class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();  
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<i+k;j++){
                hs.add(nums[j]);
            }

            for(int x:hs){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
        }
        int ans=-1;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                if(i>ans){
                    ans=i;
                }
            }

        }
        return ans;
    }
}