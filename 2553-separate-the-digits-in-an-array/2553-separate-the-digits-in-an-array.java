class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        String r = "";
        for(int i=0;i<n;i++){
            r+=String.valueOf(nums[i]);
        }
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<r.length();i++){
            int k = Character.getNumericValue(r.charAt(i));
            a.add(k);
        }
        int[] arr = new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i]=a.get(i);
        }
        return arr;
    }
}