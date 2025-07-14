class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<n;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[2];
        int k = 0;
        for(Map.Entry<Integer,Integer> b : a.entrySet()){
             if(b.getValue()==1){
                arr[k]=b.getKey();
                k++;
             }
        }
        return arr;
    }
}