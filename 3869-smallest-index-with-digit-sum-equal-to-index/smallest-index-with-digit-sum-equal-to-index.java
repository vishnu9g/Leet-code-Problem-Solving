class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min = 1000;
        for(int i=0;i<n;i++){
            int sum = 0;
            while(nums[i]!=0){
                int rem = nums[i]%10;
                sum+=rem;
                nums[i]/=10;
            }
            if(sum==i){
                min=Math.min(sum,min);
            }
        }
        if(min==1000){
            return -1;
        }
        return min;
    }
}