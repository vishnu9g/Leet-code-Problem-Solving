class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] f = new int[26];
        for(int i=0;i<chars.length();i++){
            f[chars.charAt(i)-'a']++;
        }
        int r = 0;
        for(int i=0;i<words.length;i++){
            char[] arr1 = words[i].toCharArray();
            int[] temp = new int[26];
            for(int j=0;j<arr1.length;j++){
                temp[arr1[j]-'a']++;
            }
            boolean b = true;
            for(int k=0;k<26;k++){
                if(temp[k]>f[k]){
                    b=false;
                    break;
                }
            }
            if(b){
                r+=words[i].length();
            }
        }
        return r;
    }
}