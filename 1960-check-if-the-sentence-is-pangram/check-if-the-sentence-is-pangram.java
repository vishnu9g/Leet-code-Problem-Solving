class Solution {
    public boolean checkIfPangram(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
             if(!(arr[i]>=1)) return false;
        }
        return true;
    }
}