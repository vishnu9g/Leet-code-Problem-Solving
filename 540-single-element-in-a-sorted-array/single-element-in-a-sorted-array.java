class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>b:a.entrySet()){
            if(b.getValue()==1){
                return b.getKey();
            }
        }
        return 0;
    }
}