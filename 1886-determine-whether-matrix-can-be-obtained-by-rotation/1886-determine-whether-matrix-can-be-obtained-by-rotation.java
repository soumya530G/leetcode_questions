class Solution {
    public void rotate(int[][] mat)
    {
         //transpose
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = i; j < mat[0].length; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //reverse
        for(int i = 0; i < mat.length; i++)
        {
            int l = 0;
            int r = mat[i].length - 1;
            while(l < r)
            {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++)
        {
            if(Arrays.deepEquals(mat, target))
            {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}