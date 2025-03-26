class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int max=0;
        //         for(int k=i;k<=j;k++){
        //             if(nums[k]>max){
        //                 max=nums[k];
        //             }
        //         }
        //          if(max>=left&&max<=right){
        //                 c++;
        //             }  
        //     }
        // }
        // int c = 0;
        // int ans=0;
        // int max=nums[0];
        // int minc=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>max)max=nums[i];
        //     if(max<=right && max>=left){
        //         c++;
        //         minc=nums[i]>right || nums[i]<left && c!=0 ?minc+1:minc;  
        //     }
            
        //     else {
        //         System.out.println(c);
        //         max=0;
        //         ans+=(c*(c+1))/2;
        //         ans-=minc;
        //          minc=0;
        //         c=0;
        //     }
        // }
        // ans=c!=0?ans+(c*(c+1))/2:ans;
       
        // return ans;
        // //System.out.print(ans);
        // // return c!=0?ans+(c*(c+1))/2:ans;
        int start = -1;
        int end = -1;
        int c = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>right){
                start = i;
            }
            if(nums[i]>=left){
                end=i;
            }
            c+=end-start;
        }
        return c;
    }
}