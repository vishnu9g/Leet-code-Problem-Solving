class Solution {
    public boolean isBalanced(String num) {
        int e = 0;
        int o = 0;
        for(int i=0;i<num.length();i=i+2){
            int et=Character.getNumericValue(num.charAt(i));
            e+=et;
        }
        for(int i=1;i<num.length();i=i+2){
            int ot=Character.getNumericValue(num.charAt(i));
            o+=ot;
        }
        if(o==e) return true;
        return false;
    }
}