class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];
        int k=0;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    c=1;
                    c++;
                }
            }
            if(c==2){
             arr[k]+=nums[i];
              k++;
            }
            c=0; 
        }
        return arr;
    }
}