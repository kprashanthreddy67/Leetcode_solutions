class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<k;i++){
            left+=cardPoints[i];
        }
        max=left;
        int index=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            left-=cardPoints[i];
            right+=cardPoints[index];
            index--;
            max=Math.max(max,left+right);
        }
        return max;
    }
}