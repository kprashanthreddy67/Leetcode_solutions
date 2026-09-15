class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int l=0;
        
        int max=0;
        for(int r=0;r<grumpy.length;r++){
            if(grumpy[r]==1){
                sum+=customers[r];
            }
            while(r-l+1>minutes){
                if(grumpy[l]==1){
                    sum-=customers[l];
                }
                l++;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}