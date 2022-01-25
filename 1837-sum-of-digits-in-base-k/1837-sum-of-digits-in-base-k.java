class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        int count = 0;
        while(n!=0)
        {
            //int t = n % k;
            sum = sum + n % k;
            count++;
            n /= k;
        }
        return sum;
        
    }
}