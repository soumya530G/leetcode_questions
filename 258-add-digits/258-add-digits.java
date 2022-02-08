class Solution {
    public static int cal(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        num = cal(num);
        while(num >= 10)
        {
            num = cal(num);
        }
        return num;
    }
}