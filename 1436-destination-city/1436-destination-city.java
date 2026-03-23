class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> p = new HashSet<>();
        Set<String> d = new HashSet<>();
        for(List<String> k : paths){
                p.add(k.get(0));
                d.add(k.get(1));
        }
        for(String r : d){
            if(!p.contains(r)){
                return r;
            }
        }
        return "";
    }
}