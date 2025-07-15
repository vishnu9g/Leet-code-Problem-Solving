class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,ArrayList<String>> a = new HashMap<>();
        int n = s.length;
        for(int i=0;i<n;i++){
            char[] arr = s[i].toCharArray();
            Arrays.sort(arr);
            String k = new String(arr);
            if(!(a.containsKey(k))){
                a.put(k,new ArrayList<>());
            }
            a.get(k).add(s[i]);
        }
        return new ArrayList<>(a.values());
    }
}