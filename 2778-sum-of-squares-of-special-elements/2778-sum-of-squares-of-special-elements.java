class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int k = 0;
        int id = 1;
        for(int i=0;i<n;i++){  
            if(n%id==0){
                k+=nums[i]*nums[i];
            }
            id++;
        }
        return k;
    }
}