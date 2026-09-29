class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;
        int max=0;
        while(l<=r){
            maxArea=Math.min(height[l],height[r])*(r-l);
            max=Math.max(max,maxArea);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}