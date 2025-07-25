class Solution {
    public String modifyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<n;i++)
        {
            if (sb.charAt(i)=='?')
            {
                for (char c='a';c<='z';c++)
                {
                    if (i>0 && sb.charAt(i-1)==c) continue;
                    if (i<n-1 && sb.charAt(i+1)==c) continue;
                    sb.setCharAt(i,c);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
