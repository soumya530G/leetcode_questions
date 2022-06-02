class Solution {
    public int[][] transpose(int[][] matrix) {
       int M = matrix.length, N = matrix[0].length;
        int[][] B = new int[N][M];
        for (int j = 0; j < N; j++)
            for (int i = 0; i < M; i++)
                B[j][i] = matrix[i][j];
        return B;
    }
}