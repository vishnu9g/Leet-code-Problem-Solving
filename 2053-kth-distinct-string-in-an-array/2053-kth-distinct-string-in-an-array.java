class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Boolean> m = new HashMap<>();
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],false);
            }
            else{
                m.put(arr[i],true);
            }
        }
        for(int i=0;i<arr.length;i++){
            String s = arr[i]; 
            if(m.get(s)==true){
                c++;
            }
            if(c==k){
                return arr[i];
            }
        }
        return "";
    }
}