class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        for(int i=1;i<n-1;i++){
            if(s.charAt(i-1)=='L'&&s.charAt(i)=='L'&&s.charAt(i+1)=='L'){
                return false;
            }
        }
        int a = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='A'){
                a++;
            }
        }
        if(a<2){
            return true;
        }
        return false;
    }
}