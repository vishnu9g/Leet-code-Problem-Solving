class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> a = new Stack<>();
        int c = 0;
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i) ;
           if(ch == ')'){
               if(!a.isEmpty() && a.peek() == '('){
                   a.pop() ;
               } 
               else{
                   a.push(ch) ;
               }
           }
           else{
            a.push(ch) ;
           }
        }
        return a.size();
    }
}