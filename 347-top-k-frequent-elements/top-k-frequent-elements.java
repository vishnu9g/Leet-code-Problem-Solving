class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> a = new HashMap<>();
       for(int i:nums){
        a.put(i,a.getOrDefault(i,0)+1);
       }
       int[] arr = new int[k];
       int id = 0;
       while(id<k){
        int max = 0;
        int val = 0;
        for(int i:a.keySet()){
            if(a.get(i)>max){
                max=a.get(i);
                val=i;
            }
        }
       arr[id++]=val;
       a.remove(val);
       }
       return arr;
    }
}