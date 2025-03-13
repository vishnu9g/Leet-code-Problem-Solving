class Solution {
    public int finalValueAfterOperations(String[] o) {
        int n = o.length;
        int x=0;
        for(int i=0;i<n;i++){
            if(o[i].charAt(1)=='+')x++;
            else x--;
        }
        return x;
    }
}