class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] t = new int[nums.length];
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            t[i]=a.get(i);
        }
        return t;
    }
}