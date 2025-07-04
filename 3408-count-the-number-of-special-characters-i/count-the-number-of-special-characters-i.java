class Solution {
    public int numberOfSpecialChars(String word) {
        int s = 0;
        char[] arr =word.toCharArray();
        int n = arr.length;
        int[] uc = new int[26];
        int[] lc = new int[26];
        for(int i=0;i<n;i++){
            if(arr[i]>='A'&&arr[i]<='Z'){
                uc[arr[i]-'A']++;
            }
            else if(arr[i]>='a'&&arr[i]<='z'){
                lc[arr[i]-'a']++;
            }
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(uc[i]>0&&lc[i]>0){
                count++;
            }
        }
        return count;
    }
}