class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        double a = Double.MAX_VALUE;
        while(i<j){
            double sum = nums[i]+nums[j];
            double d = Math.min(sum/2,a);
            a=d;
            i++;
            j--;
        }
        return a;
    }
}