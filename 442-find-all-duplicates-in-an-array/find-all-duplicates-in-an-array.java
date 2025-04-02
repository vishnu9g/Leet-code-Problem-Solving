class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                a.add(nums[i]);
            }
        }
        return a;
    }
}