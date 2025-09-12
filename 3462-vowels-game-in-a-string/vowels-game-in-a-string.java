class Solution {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                return true;
            }
        }
        return false;
    }
}