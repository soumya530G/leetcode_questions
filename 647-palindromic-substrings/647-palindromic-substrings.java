class Solution {
    public static boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i + 1; j <= s.length(); j++)
            {
                String str = s.substring(i, j);
                if(isPalindrome(str) == true)
                {
                    count++;
                }
            }
        }
        return count;
    }
}