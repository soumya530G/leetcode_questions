class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return res;
        }
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;
        //int total = maxr * maxc;
        //int count = 0;
        while(minr <= maxr && minc <= maxc)
        {
            //top wall
            for(int j = minc, i = minr; j <= maxc; j++)
            {
                //System.out.println(matrix[i][j]);
                res.add(matrix[i][j]);
                //count++;
            }
            minr++;
            //right wall
            for(int i = minr, j = maxc; i <= maxr; i++)
            {
                //System.out.println(matrix[i][j]);
                res.add(matrix[i][j]);
                //count++;
            }
            maxc--;
            //bottom wall
            if(minr <= maxr)
            {
              for(int j = maxc, i = maxr; j >= minc; j--)
              {
                 //System.out.println(matrix[i][j]);
                res.add(matrix[i][j]);
                 // count++;
              }  
            }
            maxr--; 
            //left wall
            if(minc <= maxc)
            {
                for(int i = maxr, j = minc; i >= minr; i--)
                {
                  // System.out.println(matrix[i][j]);
                  res.add(matrix[i][j]);
                  //count++;
                }   
            }
            minc++;
        }
       return res; 
    }
}