class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int r = 0;
        int c = 0;
        int m = 0;
        for(int i=0;i<n;i++){
            c=1;
            for(int j=i+1;j<n-1;j++){
                if(nums[i]==nums[j]){
                      c++;
                      m++;
                }
            }
            if(c>m){
                r=nums[i];
            }
        }
        return r;
    }
}