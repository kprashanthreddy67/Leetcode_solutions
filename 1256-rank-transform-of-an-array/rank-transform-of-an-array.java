class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int num[]=arr.clone();
        Arrays.sort(num);
       int rank=1;
        Map<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<num.length;i++){
            int val=num[i];
            if(!hm.containsKey(val)){
                hm.put(val, rank);
                rank++;
            }
        }
        
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=hm.get(arr[i]);
        }
        return nums;
    }
}