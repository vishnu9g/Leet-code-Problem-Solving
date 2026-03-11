class Solution {
    public int bitwiseComplement(int n) {
        String k = Integer.toBinaryString(n);
        String r = "";
        for(int i=0;i<k.length();i++){
            char ch = k.charAt(i);
            if(ch=='0') r+='1';
            else r+='0';
        }
        return Integer.parseInt(r,2);
    }
}