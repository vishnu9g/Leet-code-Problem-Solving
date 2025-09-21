class Solution {
    public boolean checkIfPangram(String s) {
        for(int i=97;i<=122;i++){
            if(s.indexOf((char)i)==-1) return false;
        }
        return true;
    }
}