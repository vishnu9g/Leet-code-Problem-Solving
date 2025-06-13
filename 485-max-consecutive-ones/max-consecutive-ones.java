class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int c2 = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c2++;
            }
            if(nums[i]==0){
                c2=0;
            }
            if(c2>c){
                c=c2;
            }
        }
        return c;
    }
}