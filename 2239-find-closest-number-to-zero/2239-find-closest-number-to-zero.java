class Solution {
    public int findClosestNumber(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if((Math.abs(nums[i])<Math.abs(max))){
                if(nums[i]>0){
                max=nums[i];
                }
            }
        }
        return max;
    }
}