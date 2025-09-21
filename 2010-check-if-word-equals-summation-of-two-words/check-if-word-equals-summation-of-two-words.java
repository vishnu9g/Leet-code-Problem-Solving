class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for(int i=0;i<f.length();i++){
            s1=s1*10+f.charAt(i)-'a';
        }
        for(int i=0;i<s.length();i++){
            s2=s2*10+s.charAt(i)-'a';
        }
        for(int i=0;i<t.length();i++){
            s3=s3*10+t.charAt(i)-'a';
        }
        if(s1+s2==s3) return true;
        return false;
    }
}