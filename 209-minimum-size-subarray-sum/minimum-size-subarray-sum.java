class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int c = 0;
        int sum = 0;
        int i = 0;      
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            c = j - i + 1;        
            while (sum >= target) {
                min = Math.min(min, c);
                sum -= nums[i];
                i++;
                c = j - i + 1;
            }
        }       
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
