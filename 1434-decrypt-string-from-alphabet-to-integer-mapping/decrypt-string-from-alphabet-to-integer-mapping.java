class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        String a = " abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            boolean b = false;
            String r ="";
            if(i+2<n&&s.charAt(i+2)=='#'){
                r=s.substring(i,i+2);
                b=true;
            }
            if(b){
                sb.append(a.charAt(Integer.parseInt(r)));
                i=i+2;
            }
            else{
                 sb.append(a.charAt(Integer.parseInt(String.valueOf(s.charAt(i)))));
             }
        }
        return sb.toString();
    }
}