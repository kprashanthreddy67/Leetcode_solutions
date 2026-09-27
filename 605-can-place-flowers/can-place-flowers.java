class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int cnt=0;
        for(int i=0;i<flowerbed.length;i++){
            int val=flowerbed[i];
            boolean isplaced=false;
            int left=(i==0)?0:flowerbed[i-1];
            int right=(i==flowerbed.length-1)?0:flowerbed[i+1];
            if(val==0 && left==0 && right==0){
                // cnt++;
                n-=1;
                flowerbed[i]=1;
            }
            if(n<=0){
                return true;
            }
        }
        
        return false;
    }
}