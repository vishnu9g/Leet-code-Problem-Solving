class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                   if(i<j&&j<k){
                    if(Math.abs(nums[j]-nums[i])==diff&&Math.abs(nums[k]-nums[j])==diff){
                        c++;    
                    }
                   }
                }
            }
        }
        return c;
    }
}