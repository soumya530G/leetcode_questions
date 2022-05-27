class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
         if(num == 0){
            System.out.println(num);
            return count;
        }
        if(num % 2 != 0) // odd
        {
            System.out.println(num + " is odd");
            count++;
            numberOfSteps(num - 1);
        }
    if(num % 2 == 0){
        System.out.println(num + " is even");
        count++;
        num /= 2;
        numberOfSteps(num);
    }
        return count;
    }
}