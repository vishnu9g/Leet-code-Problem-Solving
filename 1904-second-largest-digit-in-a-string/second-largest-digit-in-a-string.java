class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> a = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                a.add(Character.getNumericValue(c));
            }
        }
        Set<Integer> k = new TreeSet<>(a);
        List<Integer> l = new ArrayList<>(a);
        if(l.size()==1||l.size()==0) return -1;
        return l.get(l.size()-2);
    }
}