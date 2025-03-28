class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int c = 0;
        int e = 0;
        for(int i=0;i<n;i++){
             c=0;
            while(nums[i]>0){
            nums[i]/=10;
            c++;
            }
        if(c%2==0){
        e++;
        }
        }
        return e;
    }
}