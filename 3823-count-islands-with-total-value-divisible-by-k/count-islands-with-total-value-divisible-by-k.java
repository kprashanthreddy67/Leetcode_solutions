class Solution {
    public long check(int[][] grid,int r,int c){
        if(r<0 || c<0  || r>=grid.length || c>=grid[0].length){
            return 0;
        }
        if(grid[r][c]<=0){
            return 0;
        }
        long sum=grid[r][c];
        grid[r][c]=0;
        sum+=check(grid,r,c-1);
        sum+=check(grid,r,c+1);
        sum+=check(grid,r-1,c);
        sum+=check(grid,r+1,c);
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]>0){
                    long sum=check(grid,i,j);
                    if(sum%k==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}