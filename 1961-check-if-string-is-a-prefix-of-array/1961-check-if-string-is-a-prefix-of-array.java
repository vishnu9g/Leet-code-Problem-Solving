class Solution {
    public boolean isPrefixString(String s, String[] words){
        String r = "";
        for(int i=0;i<words.length;i++){
            r+=words[i];
             if(s.equals(r)){
                return true;
             }
        }
        return false;
    }
}