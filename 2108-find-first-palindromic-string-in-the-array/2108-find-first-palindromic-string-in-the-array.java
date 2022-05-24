class Solution {
    public String rev(String str){
        String st2 = "";
        char ch;
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            st2 = ch + st2;
        }
        return st2;
    } 
    public Boolean palindromic(String str){
        if(str.equals(rev(str))){
            return true;
        }
        return false;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(palindromic(words[i])){
                return words[i];
            }
        }
        String ret = "";
        return ret;
    }
}