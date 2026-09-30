class Solution {
    public boolean ispossible(int[]weights,int days,int m){
        int temp=0;
        int count=0;

        for(int i=0;i<weights.length;i++){
            if(weights[i]>m){
                return false;
            }
            if(temp+weights[i]>m){
                days-=1;
                temp=0;
            }
            temp+=weights[i];
            if(days<=0){
                return false;
            }
            // if(temp+weights[i]<=m){
            //     temp+=weights[i];
            // }else{
            //     count++;
            //     temp=weights[i];
            // }
            // if(count>=days){
            //     return false;
            // }

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