class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<2){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int d =Math.abs(nums[i-1]-nums[i]);
            max=Math.max(max,d);
        }
        return max;
    }
}