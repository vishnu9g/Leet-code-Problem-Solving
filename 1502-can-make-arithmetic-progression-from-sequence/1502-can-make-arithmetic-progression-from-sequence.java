class Solution {
    public boolean canMakeArithmeticProgression(int[] arr){
        int d = Math.abs(arr[1]-arr[0]);
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            int d1=Math.abs(arr[i+1]-arr[i]);
            if(d1!=d) return false;
        }
        return true;
    }
}