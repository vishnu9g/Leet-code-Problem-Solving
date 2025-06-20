class Solution {
    public boolean isValid(String s) {
        Stack <Character> a = new Stack<>();
        int n = s.length();
         if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
                return false;
            }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                a.push(c);
            }
            else if(!a.isEmpty()&&c==')'&&a.peek()=='('){
                a.pop();
            }
            else if(!a.isEmpty()&&c=='}'&&a.peek()=='{'){
                a.pop();
            }
            else if(!a.isEmpty()&&c==']'&&a.peek()=='['){
                a.pop();
            }

            else{
                return false;
            }
        }
        if(a.empty()){
            return true;
        }
        return false;
    }
}