class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        for(int i=0;i<n;i++){
             int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}