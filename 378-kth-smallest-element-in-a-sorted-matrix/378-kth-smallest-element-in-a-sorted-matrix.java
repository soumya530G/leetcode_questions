class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int N = matrix[0].length;
        
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
        return arr[k - 1];
    }
}