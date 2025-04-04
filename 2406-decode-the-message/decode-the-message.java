class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> a = new ArrayList<>();
        for(char c : key.toCharArray()){
            if(c!=' '){
                if(!a.contains(c)){
                    a.add(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : message.toCharArray()){
            if(c==' '){
                sb.append(c);
            }
            if(a.contains(c)){
                int index = a.indexOf(c);
                int num = index+97;
                sb.append((char)num);
            }
        }
        return sb.toString();
        
    }
}