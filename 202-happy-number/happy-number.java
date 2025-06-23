class Solution {
    public boolean isHappy(int n) {
       if(n==1||n==7){
        return true;
       }
       else if(n<10){
        return false;
       }
       else{
        int res = 0;
        while(n>0){
            int rem = n%10;
            res+=rem*rem;
            n=n/10;
        }
        return isHappy(res);
       }  
    }
}