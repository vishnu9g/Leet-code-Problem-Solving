class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                max1++;
            }
            if(nums[i]<0){
                max2++;
            }
        }
        if(max1>max2){
            return max1;
        }
        return max2;
    }
}