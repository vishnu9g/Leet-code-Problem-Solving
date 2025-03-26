class Solution {
    public boolean isSameAfterReversals(int num) {
        int c = num;
        if(num==0) return true;
        else if(num%10==0)return false;
        return true;
        // else{
        //         int rem = 0;
        //         int rev = 0;
        //         while(num>0){
        //              rem=num%10;
        //              rev=rev*10+rem;
        //              num=num/10;
        //         }
        //         int r = rev;
        //         int rem1 = 0;
        //         int rev2 = 0;
        //         while(r>0){
        //              rem1=r%10;
        //              rev2=rev2*10+rem1;
        //              r=r/10;     
        //         }
        //         if(rev2==c) return true;
        //     }
        //return false;
    }
}