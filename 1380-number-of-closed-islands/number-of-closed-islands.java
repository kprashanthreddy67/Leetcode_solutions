class Solution {
    public boolean check(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
        boolean left=check(grid,i,j-1);
        boolean right=check(grid,i,j+1);
        boolean up=check(grid,i-1,j);
        boolean down=check(grid,i+1,j);
        return (left && right && up && down);
    
    }
    public int closedIsland(int[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length ;i++){
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