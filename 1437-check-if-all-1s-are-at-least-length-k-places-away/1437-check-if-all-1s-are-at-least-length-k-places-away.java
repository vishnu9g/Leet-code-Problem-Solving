class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int ct = 0;
            if(nums[i]==1){
                for(int j=i+1;j<n;j++){
                    if(nums[j]==0){
                        ct++;
                    }
                    else{
                        if(ct<k){
                           return false;
                        }
                        break;
                    }
                }
            }    
        }
        return true;    
    }
}