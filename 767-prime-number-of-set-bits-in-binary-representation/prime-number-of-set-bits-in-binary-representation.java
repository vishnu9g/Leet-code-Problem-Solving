class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> p=Set.of(2,3,5,7,11,13,17,19);
        int r=0;
        for(int i=left;i<=right;i++){
            int c=0;
            String s = Integer.toBinaryString(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
            }
            if(p.contains(c)){
                r++;
            }
        }
        return r;
    }
}