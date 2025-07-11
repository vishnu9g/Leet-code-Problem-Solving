class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = nums.length;
        int k = n/3;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        } 
        for(Map.Entry<Integer,Integer> b:m.entrySet()){
            if(b.getValue()>k){
                a.add(b.getKey());
            }
        }  
        return a; 
    }
}