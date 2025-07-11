class Solution {
    public String concatHex36(int n) {
        int k = n*n;
        int q = n*n*n;
        String s = Integer.toHexString(k);
        String p = Integer.toString(q,36);
        String res = s.concat(p).toUpperCase();
        return res;
    }
}