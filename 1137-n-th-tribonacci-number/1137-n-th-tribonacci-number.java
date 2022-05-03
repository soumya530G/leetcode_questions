class Solution {
    public int tribonacci(int n) {  
        if(n < 2) return n;
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = 0;
       while(n > 2){
          sum = a + b + c;
          a = b;
          b = c;
          c = sum;
          n--;
       }
        return c;
    }
}