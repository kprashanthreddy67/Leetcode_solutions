class Solution {
    public int[] getAverages(int[] nums, int k) {
        long prefix[]=new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;

        }
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=k;i<=(nums.length-k-1);i++){
           long cnt=prefix[i+k];
           if(i-k>0){
            cnt-=prefix[i-k-1];
           }
           arr[i]=(int)(cnt/((2L*k)+1));
        }
        return arr;
    }
}