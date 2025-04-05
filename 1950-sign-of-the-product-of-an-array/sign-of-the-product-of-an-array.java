import java.util.*;
class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        double p = 1;
        for(int i=0;i<n;i++){
            p*=nums[i];
        }
        int a =(int)Math.signum(p);
        return a;
    }
}