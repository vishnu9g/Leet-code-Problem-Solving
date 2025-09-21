class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int r = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(isequal(sub)&&sub.length()>r){
                    r=sub.length();
                }
            }
        }
        return r;
    }
    static boolean isequal(String k){
        int st = 0;
        int en = k.length()-1;
        while(st!=en){
            if(k.charAt(st)!=k.charAt(en)){
                return false;
            }
            en--;
        }
        return true;
    }
}