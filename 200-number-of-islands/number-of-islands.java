class Solution {
    public void check(char grid[][],int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return;
        }
        if(grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        check(grid,r,c-1);
        check(grid,r,c+1);
        check(grid,r-1,c);
        check(grid,r+1,c);
    }
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    check(grid,i,j);
                }
            }
        }
        return cnt;
    }
}