class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> r = new ArrayList<>();
        long value = 1;
        r.add((int) value);
        for (int i = 1; i <= rowIndex; i++) {
            value = value * (rowIndex - i + 1) / i;
            r.add((int) value);
        }
        return r;
    }
}
