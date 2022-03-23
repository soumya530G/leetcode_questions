class Solution {
    public int fib(int n) {
    if(n == 0){
        return 0;
    }
    int a = 0;
    int b = 1;
    int c = a + b;
    for(int i = 0; i < n - 1; i++){
         c = a + b;
         a = b;
         b = c;  
         System.out.println(c);
       }
    return c; 
    }
}