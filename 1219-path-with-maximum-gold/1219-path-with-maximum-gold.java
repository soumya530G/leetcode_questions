class Solution {
    
    public int getMaximumGold(int[][] grid) {
       if(grid.length == 0 || grid == null){
           return 0;
       } 
       int max = 0;
       for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[0].length; j++){
               if(grid[i][j] > 0){
                   int gold = maxgold(grid, i , j, grid.length, grid[0].length, new boolean[grid.length][grid[0].length]);
                   max = Math.max(max, gold);
               }
           }
       } 
        return max;
    }
    private int maxgold(int[][] grid, int i, int j, int m, int n, boolean[][] vis){
        if(i >= m || j >= n || i < 0 || j < 0 || grid[i][j] == 0 || vis[i][j]){
            return 0;
        }
        vis[i][j] = true;
        int left = maxgold(grid, i, j - 1, m, n, vis);
        int right = maxgold(grid, i, j + 1, m, n, vis);
        int up = maxgold(grid, i - 1, j, m, n, vis);
        int down = maxgold(grid, i + 1, j, m, n, vis);
        vis[i][j] = false;
        return Math.max(left, Math.max(right, Math.max(up, down))) + grid[i][j];
    }
}