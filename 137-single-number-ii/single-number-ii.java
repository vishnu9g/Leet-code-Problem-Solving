class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int k = 0;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
       for (Map.Entry<Integer, Integer> v : a.entrySet()) {
            if (v.getValue() == 1) {
                k=v.getKey();
            }
        }
        return k;
    }
}