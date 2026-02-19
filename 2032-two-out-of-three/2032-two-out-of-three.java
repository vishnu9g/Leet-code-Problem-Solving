class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> a = new ArrayList<>();
        int[] f1 = new int[101];
        int[] f2 = new int[101];
        int[] f3 = new int[101];
        for(int i:nums1) f1[i]++;
        for(int i:nums2) f2[i]++;
        for(int i:nums3) f3[i]++;
        for(int i=1;i<101;i++){
            if(f1[i]!=0&&f2[i]!=0) {a.add(i); continue;}
            if(f2[i]!=0&&f3[i]!=0) {a.add(i); continue;}
            if(f1[i]!=0&&f3[i]!=0) {a.add(i); continue;}
        }
        return a;
    }
}