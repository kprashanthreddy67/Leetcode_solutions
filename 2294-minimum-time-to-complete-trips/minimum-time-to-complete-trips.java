class Solution {
    public boolean ispossible(int[] time,int totalTrips,long mid){
        long temp=0;
        for(int i=0;i<time.length;i++){
            long val=mid/time[i];
            temp+=val;
        }
        if(temp>=totalTrips){
            return true;
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long l=1;
        long r=100000000000000L;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(ispossible(time,totalTrips,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}