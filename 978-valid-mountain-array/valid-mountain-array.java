class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3) return false;
        boolean b = false;
        for(int i=0;i<n-1;i++){
            if(!b){
              if(arr[i]<arr[i+1])   continue;
              if(arr[i]==arr[i+1]) return false;
              if(arr[i]>arr[i+1]){
              if(i==0) return false;
                b=true;
              }
            }
            else{
            if(arr[i]<arr[i+1]){
                return false;
            }
            if(arr[i]==arr[i+1]){
                return false;
            }
            }
        }

        return b==true;
    }
}