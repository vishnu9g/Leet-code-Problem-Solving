class Solution {
    public boolean strongPasswordCheckerII(String s) {
        int n = s.length();
        if(n<8){
            return false;
        }
        boolean lc = false;
        boolean up = false;
        boolean od = false;
        boolean sc = false;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
        if( i!=0 && s.charAt(i)==s.charAt(i-1)){
                return false;
        }
        if(c>='a'&&c<='z'){
             lc = true;
        }
        if(c>='A'&&c<='Z'){
            up = true;
        }
        if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='+'){
            sc=true;
        }
        if(c>='0'&&c<='9'){
            od=true;
        }

        }
        if(lc==true&&od==true&&sc==true&&up==true){
            return true;
        }
        return false;
    }
}