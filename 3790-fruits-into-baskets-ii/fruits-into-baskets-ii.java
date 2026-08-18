class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int placed[]=new int[baskets.length];
        int cnt=0;
        for(int i=0;i<fruits.length;i++){
            boolean isplaced=false;
            for(int j=0;j<baskets.length;j++){
                if(placed[j]==0 && fruits[i]<=baskets[j]){
                    placed[j]=1;
                    isplaced=true;
                    break;
                }
            }
            if(!isplaced){
                cnt++;
            }
        }
        return cnt;
    }
}