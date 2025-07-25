class Solution {
    public char repeatedCharacter(String s) {
        char c =' ';
        HashMap<Character,Integer> a = new HashMap<>();
        for(char ch : s.toCharArray()){
            a.put(ch,a.getOrDefault(ch,0)+1);
            if(a.get(ch)==2){
                return ch;
            }
        }
        return c;
    }
}