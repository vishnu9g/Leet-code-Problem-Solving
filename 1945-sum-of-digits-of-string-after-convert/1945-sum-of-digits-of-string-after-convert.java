class Solution {
    public int getLucky(String s, int k) {
            int n = 0;
            int n1;
            for(int i=0;i<s.length();i++){
                int num=s.charAt(i)-'a'+1;
                while(num>0){
                   n+=num%10;
                   num/=10;
                }
            }
            while(k>1){
                int res = 0;
                n1=n;
                while(n1>0){
                int rem = n1%10;
                res+=rem;
                n1/=10;
                }
                n=res;
                k--;
            }
            return n;
    }
}