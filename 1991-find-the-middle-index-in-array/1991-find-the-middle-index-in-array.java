class Solution {
    public int findMiddleIndex(int[] nums){
        int n = nums.length;
        int id = 0;
        for(int i=0;i<n;i++){
            int lsum = 0;
            int rsum = 0;
            int k = i-1;
            while(k>=0){
                lsum+=nums[k];
                k--;
            }
            int k1 = i+1;
            while(k1<n){
                rsum+=nums[k1];
                k1++;
            } 
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
}