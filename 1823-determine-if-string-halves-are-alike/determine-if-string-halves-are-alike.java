class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int fh =0;
        int sh =0;
        for(int i=0;i<n/2;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                fh++;
            }
            else  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                fh++;
            }
        }
        for(int i=n/2;i<n;i++){
            char d=s.charAt(i);
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'){
                sh++;
            }
            else  if(d=='A'||d=='E'||d=='I'||d=='O'||d=='U'){
                sh++;
            }
        }
        if(fh==sh){
            return true;
        }
        return false;
    }
}