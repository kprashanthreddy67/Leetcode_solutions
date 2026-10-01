class Solution {
    public boolean ispossible(int[] bloomDay,int m,int k,int mi){
        int temp=0;
        for(int i=0;i<bloomDay.length;i++){
            int val=bloomDay[i];
            if(mi>=val){
                temp++;
                if(temp==k){
                    m-=1;
                    temp=0;
                }
            }else{
                temp=0;
            }
            
        }
        if(m>0){
                return false;
        }
        return true;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=0;
        int r=(int)Math.pow(10,9);
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(bloomDay,m,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}