class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int leftsum=0;
        int rightsum=0;
        int cnt=0;
        while(l<=r){
            if(height[l]<height[r]){
                if(height[l]>leftsum){
                    leftsum=height[l];
                }else{
                    cnt+=(leftsum-height[l]);
                }
                l++;
            }else{
                if(height[r]>rightsum){
                    rightsum=height[r];
                }else{
                    cnt+=(rightsum-height[r]);
                }
                r--;
            }

        }
        return cnt;
    }
}