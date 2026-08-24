class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int arr[]=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
              hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                arr[j++]=i;
            }
        }
        return arr;
    }
}