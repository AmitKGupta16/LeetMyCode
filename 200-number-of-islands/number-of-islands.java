class Solution {
    public int numIslands(char[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        int count=0;
        boolean[][] visited = new boolean[N][M];
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(grid[i][j]=='1' && !visited[i][j]) {
                    isValid(i,j,visited,grid);
                    count++;

                }
            }
        }
        return count;
        
    }

    public void isValid(int i, int j,boolean[][] visited, char[][] A) {
        if(i<0 || j<0 || i >= A.length || j >= A[0].length || visited[i][j] || A[i][j]=='0'){
            return;
        }
        visited[i][j] = true;
        isValid(i-1,j,visited,A);
        isValid(i+1,j,visited,A);
        isValid(i,j-1,visited,A);
        isValid(i,j+1,visited,A);
    }
}