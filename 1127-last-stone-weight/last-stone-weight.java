class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
          a.add(stones[i]);
        }
        while(a.size()>1){
            Collections.sort(a);
            int r = Math.abs(a.get(a.size()-1)-a.get(a.size()-2));
            a.remove(a.size()-1);
            a.remove(a.size()-1);
            if(r>0){
                a.add(r);
            }
        }
        if(a.isEmpty()) {
            return 0;
        }
        return a.get(0);
    }
}