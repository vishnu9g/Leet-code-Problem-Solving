class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> b = new HashSet<>();
        for(int i=0;i<n;i++){
            b.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!b.contains(i)){
                a.add(i);
            }
        }
        //System.out.print(b);
        return a;
    }
}