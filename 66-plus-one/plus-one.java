class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length-1;
        for(int i=0;i<=n;i++){
            if(digits[n-i]<9){
                    digits[n-i]+=1;
                    break;
            }
            else{
                digits[n-i]=0;
            }

        }
        if(digits[0]==0){
            int arr[]=new int [n+2];
            arr[0]=1;
            return arr;
        }
        return digits;
      
    }
}