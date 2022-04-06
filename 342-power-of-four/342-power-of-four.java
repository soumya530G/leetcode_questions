class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0 || n == 2){
            return false;
        }
        int val = n & (n-1);
        if(val == 0 && n % 3 == 1){
            return true;
        }
        else{
            return false;
        }
    }
}