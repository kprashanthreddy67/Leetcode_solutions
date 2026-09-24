class Solution {
    public int smallestIndex(int[] nums) {
        
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int digit=nums[i]%10;
                sum+=digit;
                nums[i]/=10;
            }
            arr[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}