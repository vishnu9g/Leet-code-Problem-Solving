import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger q = new BigInteger(a,2);
        BigInteger w = new BigInteger(b,2);
        BigInteger e = q.add(w);
        String res = e.toString(2);
        return res;
    }
}