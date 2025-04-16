class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] c1 = s.toCharArray();
        // char[] c2 = t.toCharArray();
        // Arrays.sort(c1);
        // Arrays.sort(c2);
        // if(Arrays.equals(c1,c2)){
        //     return true;
        // }
        // return false;
        Map<Character,Integer> a = new TreeMap<>();
        Map<Character,Integer> b = new TreeMap<>();
        for(char c : s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        for(char c1 : t.toCharArray()){
            b.put(c1,b.getOrDefault(c1,0)+1);
        }
        return a.equals(b);
    }

}