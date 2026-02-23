class Solution {
    public int[] sortByBits(int[] arr) {
        int n =  arr.length;
        int base = 10001;
        for(int i=0;i<n;i++){
            arr[i]+=Integer.bitCount(arr[i])*base;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
            arr[i]%=base;
        }
        return arr;
    }
}