class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        char []ch1=word1.toCharArray();
        char []ch2=word2.toCharArray();
        int i=ch1.length;
        int j=ch2.length;
        int min=Math.min(i,j);
        int k=0;
        while(k<min){
            sb.append(ch1[k]);
            sb.append(ch2[k]);
            k++;
        }
        while(k<i){
            sb.append(ch1[k]);
            k++;
        }
        while(k<j){
            sb.append(ch2[k]);
            k++;
        }
        return sb.toString();
    }
}