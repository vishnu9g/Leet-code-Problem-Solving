public class Solution {
    public int[] NextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.Length;
        int n2 = nums2.Length;
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){
            bool b = false;;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<n2;k++){
                        if(nums1[i]<nums2[k]){
                               arr[i]=nums2[k];
                               b=true;
                               break;
                        }
                    }
                }
            }
            if(!b) arr[i]=-1;
        }
        return arr;
    }
}