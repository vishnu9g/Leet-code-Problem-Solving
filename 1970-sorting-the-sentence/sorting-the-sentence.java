class Solution {
    public String sortSentence(String s) {
        int n = s.length();
        String[] arr = s.split(" ");
        List<String> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String t = new String(arr[i]);
            a.add(t.substring(0,t.length()-1));
            b.add(Character.getNumericValue(t.charAt(t.length()-1)));
        }
        String[] arr1 = new String[arr.length];
        for(int i=0;i<a.size();i++){
            arr1[b.get(i)-1]=a.get(i);
        }
        String r ="";
        for(int i=0;i<arr1.length;i++){
            r+=new String(arr1[i])+" ";
        }
        return r.trim();
    }
}