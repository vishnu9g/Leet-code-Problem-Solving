class Solution {
    public String sortVowels(String s) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            sb.append(c);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                a.add(i);
                b.add((int)c);
            }
            else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                a.add(i);
                b.add((int)c);
            }
        }
        if(a.size()==0) return s;
        Collections.sort(b);
        for(int i=0;i<a.size();i++){
               sb.setCharAt(a.get(i),(char)(int)b.get(i));
        }
        return sb.toString();
    }
}