class Solution {
    public int reverse(int x) {
        
        int rev = 0;
        long rem = 0;
        boolean b = false;
        if(x<0){
            b=true;
        }
        x=Math.abs(x);
        
        while(x>0){
            rev=x%10;
            rem=rem*10+rev;
            x=x/10;
        }
        System.out.println(rem);
        if(rem > Integer.MAX_VALUE){
            return 0;
        }
        if(b){
            return (int) rem*-1;
        }
        return (int) rem;
    }
}