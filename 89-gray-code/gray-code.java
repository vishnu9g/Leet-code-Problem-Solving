class Solution {
    public List<Integer> grayCode(int n) {
        int l = 1<<n;
        ArrayList<Integer> r= new ArrayList<>();
        for (int i=0;i<l;i++) {
            r.add(i^(i>>1));
        }
        return r;
    }
}