class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean im = true;
        boolean dm = true;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                im = false;
            }
            if(nums[i]>nums[i+1]){
                dm = false;
            }
            if(!dm&&!im){
            return false;
        }
        }
        return true;
    }
}