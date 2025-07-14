class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int p = 1;
       int oc = 0;
       for(int i=0;i<n;i++){         
         p*=nums[i];
         if(nums[i]==0){
            oc++;
         }
       }
       if(oc==0){
       for(int i=0;i<n;i++){
            nums[i]=p/nums[i];
       }
       }
       if(oc==1){
         int p1 = 1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                p1*=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=p1;
            }
            else{
                nums[i]=0;
            }
        }
       }
       if(oc>=2){
        for(int i=0;i<n;i++){
            nums[i]=0;
        }
       }
       return nums;
    }
}