class Solution {
    public int[] getAverages(int[] nums, int k) {
        long  prefix[]=new long[nums.length];
        int n=nums.length;
        
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
        }
        for(int i=k;i<=(n-k-1);i++){
            long cnt=prefix[i+k]-((i-k>0)?prefix[i-k-1]:0);
            arr[i]=(int)(cnt/((2L*k)+1));

        }
        return arr;
    }
}