class Solution {
    public int countEven(int num) {
        int[] arr = new int[num];
        int n = arr.length;
        int k = 0;
        for(int i=1;i<=n;i++){
        arr[k++]+=i;
        }
        int c = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            while(arr[i]>0){
                int rem = arr[i]%10;
                    sum+=arr[i];
                    arr[i]=arr[i]/10;
            }
            if(sum%2==0){
                c++;
            }
        }
        return c;
    }
}