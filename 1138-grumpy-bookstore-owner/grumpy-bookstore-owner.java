class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        int l=0;
        int ans=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        for(int r=0;r<grumpy.length;r++){
            if(grumpy[r]==1){
                sum+=customers[r];
            }
            if(r-l+1>minutes){
                if(grumpy[l]==1){
                    sum-=customers[l];
                }
                l++;
            }
            if(r-l+1==minutes){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}