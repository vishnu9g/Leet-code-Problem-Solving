import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int n1 = s.length();
        int c=0;
        for(int i=0;i<n1;i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}