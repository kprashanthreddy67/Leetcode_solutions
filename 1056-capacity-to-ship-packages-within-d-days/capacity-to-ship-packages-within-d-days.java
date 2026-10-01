class Solution {
    public boolean ispossible(int[] weights,int days,int m){
        int temp=0;
        for(int i=0;i<weights.length;i++){
            int val=weights[i];
            if(val>m){
                return false;
            }
            if(temp+val<=m){
                temp+=val;
            }else{
                days-=1;
                temp=val;
            }
            if(days<=0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(weights,days,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}