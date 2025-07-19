class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        int[][] mat = new int[r][c];
        int k = 0;
        for(int i=0;i<r;i++){
            int q = 0;
            for(int j=c-1;j>=0;j--){
                mat[k][q]=image[i][j];
                q++;
            }
            k++;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    mat[i][j]=1;
                }
                else if(mat[i][j]==1){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}