class Solution {
    public boolean ispossible(int[] piles,int h,int m){
        int temp=0;
        for(int i=0;i<piles.length;i++){
            int val=piles[i]/m;
            if(piles[i]%m!=0){
                val++;
            }
            h-=val;
            if(h<0){
                return false;
            }
            
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i:piles){
            r=Math.max(r,i);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(piles,h,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}