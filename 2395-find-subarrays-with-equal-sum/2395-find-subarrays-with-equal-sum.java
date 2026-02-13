class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> a = new HashSet<>();
        for(int i=0;i<n-1;i++){
            int sum = nums[i]+nums[i+1];
            if(a.contains(sum)) return true;
            a.add(sum);
        }
        return false;
    }
}