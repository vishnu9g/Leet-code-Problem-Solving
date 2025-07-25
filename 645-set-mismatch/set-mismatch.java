class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
       for(int i:nums){
        arr[i]++;
       }
        int[] res = {-1,-1};
        for(int i=1;i<n+1;i++){
            if(arr[i]==0){
                res[1]=i;
            }
            if(arr[i]==2){
                res[0]=i;
            }
        }
        if(res[1]==-1){
            res[1]=n;
        }
        return res;
    }
}