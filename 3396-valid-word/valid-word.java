class Solution{
    public boolean isValid(String word){
        int n=word.length();
        if(n<3){
            return false;
        }
        boolean v=false;
        boolean cs=false;
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                return false;
            }
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                v=true;
            }
            else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                cs=true;
            }
        }
        if(!(v&&cs)){
            return false;
        }
        return true;
    }
}
