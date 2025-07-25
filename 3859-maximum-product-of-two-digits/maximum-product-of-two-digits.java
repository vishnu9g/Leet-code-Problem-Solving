class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        while(n!=0){
            int rem = n%10;
            a.add(rem);
            n/=10;
        }
        Collections.sort(a);
        int k = a.size();
        int p = a.get(k-1)*a.get(k-2);
        return p;
    }
}