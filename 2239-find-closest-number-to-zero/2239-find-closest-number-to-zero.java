class Solution {
    public int findClosestNumber(int[] nums) {
        int c = nums[0];
        for (int num:nums) {
            if(Math.abs(num)<Math.abs(c)||(Math.abs(num)==Math.abs(c)&&num>c)){
                c=num;
            }
        }   
        return c;
    }
}