class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int l=ops.length;
        if(l==0){
            return m*n;
        }
        for(int i=0;i<l;i++){
            int a = ops[i][0];
            int b = ops[i][1];
            m=Math.min(m,a);
            n=Math.min(n,b);
        }
        return m*n;
    }
}