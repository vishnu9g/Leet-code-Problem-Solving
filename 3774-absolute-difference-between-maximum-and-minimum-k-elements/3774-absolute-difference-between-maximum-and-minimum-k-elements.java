class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        int min = 0;
        for(int i=0;i<k;i++){
            min+=nums[i];
        }
        for(int i=n-1;i>=n-k;i--){
            max+=nums[i];
        }
        return Math.abs(max-min);
    }
}