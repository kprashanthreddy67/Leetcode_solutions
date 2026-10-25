class Solution {
    public boolean check(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return false;
        }
        if(grid[r][c]==1){
            return true;
        }
        grid[r][c]=1;
        boolean is_left =  check(grid,r,c-1);
        boolean is_right = check(grid,r,c+1);
        boolean is_up = check(grid,r-1,c);
        boolean is_down = check(grid,r+1,c);
        return is_left && is_right && is_up && is_down;
    }
    public int closedIsland(int[][] grid) {
        int  cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    if(check(grid,i,j)==true){
                    cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}