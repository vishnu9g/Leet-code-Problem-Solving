class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int[] f = new int[100001];
        int max = 0;
        int r = -1;
        for(int num:nums){
            if(num%2==0){
                f[num]++;
                if(f[num]>max||f[num]==max&&num<r){
                    max=f[num];
                    r=num;
                }
            }
        }
        return r;
    }
}