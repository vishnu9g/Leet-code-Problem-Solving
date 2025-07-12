class Solution {
    public int maximumWealth(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int max = 0;
        for(int i=0;i<r;i++){
            int sum = 0;
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}