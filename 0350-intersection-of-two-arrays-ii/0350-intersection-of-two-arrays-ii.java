class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean[] b = new boolean[nums1.length];
        boolean[] b1 = new boolean[nums2.length];
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(b[i]==false){
            for(int j=0;j<nums2.length;j++){
                    if((!b1[j])&&nums1[i]==nums2[j]){
                        a.add(nums1[i]);
                        b[i]=true;
                        b1[j]=true;
                        break;
                    }
                }
            }
        }
        int[] r = new int[a.size()];
        for(int i=0;i<a.size();i++){
            r[i]=a.get(i);
        }
        return r;
    }
}