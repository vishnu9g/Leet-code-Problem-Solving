class Solution {
    public String largestGoodInteger(String num) {
        String s ="";
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                String sub = num.substring(i,i+3);
                if(sub.compareTo(s)>0){
                    s=sub;
                }
            }
        }
        return s;
    }
}