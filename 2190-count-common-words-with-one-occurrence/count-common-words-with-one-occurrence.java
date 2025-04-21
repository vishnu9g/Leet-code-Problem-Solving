class Solution {
    public int countWords(String[] w1, String[] w2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s : w1){
            map.put(s,map.getOrDefault(s,0)+1);
            if(map.get(s)>1)map.put(s,-10);
        }
        for(String s : w2){
            map.put(s,map.getOrDefault(s,0)-1);
        }
        int c=0;
        for(int i : map.values()){
            if(i==0)c++;
        }
        return c;
    }
}