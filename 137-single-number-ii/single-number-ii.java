class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int k = 0;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
       for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            if (entry.getValue() == 1) {
                k=entry.getKey();
            }
        }
        return k;
    }
}