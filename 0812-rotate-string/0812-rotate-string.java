class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
       String res = s.concat(s);
       if(res.contains(goal)){
        return true;
       } 
       return false;
    }
}