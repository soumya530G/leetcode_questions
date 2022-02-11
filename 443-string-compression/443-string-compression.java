class Solution {
    public int compress(char[] chars) {
        int count = 1;
        String s = chars[0] + "";
        for(int i = 1; i < chars.length; i++)
        {
            char prev = chars[i-1];
            char curr = chars[i];
            if(prev == curr)
            {
                count++;
            }
            else
            {
                if(count > 1)
                {
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
        if(count > 1)
        {
            s += count;
            count = 1;
        }
        for(int i = 0; i < s.length(); i++)
        {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}