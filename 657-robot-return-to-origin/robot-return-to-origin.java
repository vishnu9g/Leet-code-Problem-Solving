class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[2];
        int n = moves.length();
        char[] arr1 = moves.toCharArray();
        for(int i=0;i<n;i++){
            if(arr1[i]=='L'){
                arr[0]++;
            }
            if(arr1[i]=='R'){
                arr[0]--;
            }
            if(arr1[i]=='U'){
                arr[1]++;
            }
            if(arr1[i]=='D'){
                arr[1]--;
            }
        }
        if(arr[0]==0&&arr[1]==0){
            return true;
        }
        return false;
    }
}