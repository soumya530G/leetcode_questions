class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int N = 0;
        for(int i = 0; i < matrix[0].length; i++){
            N++;
        }
        int ke = N * N;
        int kq = 0;
        int[] arr = new int[ke];
        for(int i = 0; i < N; i++){
           for(int j = 0; j < N; j++){
               if(kq != ke)
               {
                   arr[kq] = matrix[i][j];
                   kq++;
               }
           } 
        }
        Arrays.sort(arr);
        int t = 0;
        for(int i = 0; i < ke; i++){
            if(i == k - 1)
                t = arr[i];
          //  System.out.println(arr[i]);
        }
        
        return t;
    }
}