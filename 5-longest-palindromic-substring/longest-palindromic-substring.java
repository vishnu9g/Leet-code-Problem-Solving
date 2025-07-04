class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String l="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(palindrome(sub)&sub.length()>l.length()){
                    l=sub;
                }
            }
        }
        return l;
    }
    static boolean palindrome(String sub){
        int start = 0;
        int end = sub.length()-1;
        while(start<end){
            if(sub.charAt(start)!=sub.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}