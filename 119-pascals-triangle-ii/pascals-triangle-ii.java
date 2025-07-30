class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = rowIndex;
        long k = 1;
        a.add((int)k);
        for (int i=1;i<=n;i++) {
            k=k*(n-i+1)/i;
            a.add((int)k);
        }

        return a;
    }
}
