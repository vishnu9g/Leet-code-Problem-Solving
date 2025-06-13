import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n1;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            a.add(nums2[i]);
        }
        int[] arr = new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i]+=a.get(i);
        }
        Arrays.sort(arr);
        int k = arr.length/2;
        double res = 0;
         if(arr.length%2!=0){
            res+=arr[k];
        }
        else{
            res+=((arr[k]+arr[k-1])/2.0);
        }
        System.out.print(Arrays.toString(arr));
        return res;
    }
}