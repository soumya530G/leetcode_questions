class Solution {
    public int[][] generateMatrix(int n) {

        int[][]arr = new int[n][n];
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int no = 1;
        while(minr <= maxr && minc <= maxc)
        {
            //top wall
            for(int j = minc, i = minr; j <= maxc; j++)
            {
                arr[i][j] = no;
                no++;
            }
            minr++;
            //right wall
            for(int i = minr, j = maxc; i <= maxr; i++)
            {
                arr[i][j] = no;
                no++;
            }
            maxc--;
            //bottom wall
            if(minr <= maxr)
            {
              for(int j = maxc, i = maxr; j >= minc; j--)
              {
                 arr[i][j] = no;
                 no++;
              }  
            }
            maxr--; 
            //left wall
            if(minc <= maxc)
            {
                for(int i = maxr, j = minc; i >= minr; i--)
                {
                  arr[i][j] = no;
                  no++;
                }   
            }
            minc++;   
        }
        return arr;
    }
}