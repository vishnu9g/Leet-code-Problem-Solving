class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(nums[i]);
        }
        return isrotated(a);
    }
    static boolean isrotated(List<Integer> a){
        for(int i=0;i<a.size();i++){
            ArrayList<Integer> temp = new ArrayList<>(a);
            Collections.rotate(temp,i);
            if(issorted(temp)){
                return true;
            }
        }
         return false;
    }
    static boolean issorted(List<Integer> t){
        for(int i=0;i<t.size()-1;i++){
            if(t.get(i)>t.get(i+1)){
                return false;
            }
        }
        return true;
    }
}