class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean b = true;
        while(b){
            b=false;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==original){
                original=original*2;
                b=true;
            }
        }
        }
        return original;
    }
}