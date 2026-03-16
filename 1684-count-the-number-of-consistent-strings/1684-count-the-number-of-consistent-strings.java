class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        for(String s:words){
            boolean b = true;
            for(int j=0;j<s.length();j++){
                if(allowed.indexOf(s.charAt(j))==-1){
                    b=false;
                    break;
                }
            }
            if(b) c++;
        }
        return c;
    }
}