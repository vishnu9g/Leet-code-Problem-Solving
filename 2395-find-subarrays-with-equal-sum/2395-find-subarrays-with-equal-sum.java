class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int s1 = nums[i]+nums[i+1];
            for(int j=i+1;j<n-1;j++){
                int s2 = nums[j]+nums[j+1];
                if(s1==s2) return true;
           }
        }
        return false;
    }
}