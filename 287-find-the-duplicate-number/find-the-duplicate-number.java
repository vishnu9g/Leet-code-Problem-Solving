class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        String s = "";
        for(int i=1;i<n;i++){
         if(nums[i]==nums[i-1]){
            s+=nums[i];
            break;
         }
        }
        int a = Integer.parseInt(s);
        return a;
    }
}