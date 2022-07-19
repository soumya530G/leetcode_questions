class Solution {
    public int maxArea(int[] height) {
       int start = 0;
       int end = height.length - 1;
       int num = 0;
       int max = 0;
       while(start < end){ 
       num = Math.min(height[start], height[end]) * (end - start);
       if(num > max){
           max = num;
       } 
       if(height[start] <= height[end]){
           start++;
       } else if(height[start] > height[end]){
           end--;
       }
       }
        return max;
    }
}