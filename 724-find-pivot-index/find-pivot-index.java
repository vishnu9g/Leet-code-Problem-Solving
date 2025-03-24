class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
         int lsum =0;
        int rsum = 0;
        int tsum=0;
        for(int num:nums){
            tsum+=num;
        }
        for(int i=0;i<n;i++){
            rsum=tsum-lsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}