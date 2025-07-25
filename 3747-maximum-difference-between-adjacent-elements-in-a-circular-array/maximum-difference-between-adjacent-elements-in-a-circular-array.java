class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=1;i<n;i++){
            int d = Math.abs(nums[i-1]-nums[i]);
            max=Math.max(d,max);
            max=Math.max(Math.abs(nums[0]-nums[n-1]),max);
        }
        return max;
    }
}