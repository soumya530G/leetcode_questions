class Solution {
    public boolean ispalindrome(String s){
        int j = s.length() - 1;
       for(int i = 0; i < s.length()/2; i++){
           if(s.charAt(i) != s.charAt(j - i)){
               return false;
           }
       }
        return true;
    }
    public int removePalindromeSub(String s) {
        //case 1: if given s is empty
        if(s == null){
            return 0;
        }
        //case 2: if the string is palindromic 
        if(ispalindrome(s) == true){
            return 1;
        }
        return 2;
    }
}