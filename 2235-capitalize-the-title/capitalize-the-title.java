class Solution {
    public String capitalizeTitle(String title) {
        String a = title.toLowerCase();
        String[] s = a.split(" ");
        int n = s.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s[i].length()>2){
        sb.append(Character.toUpperCase(s[i].charAt(0))).append(s[i].substring(1)).append(" ");
            }
            else{
                sb.append(s[i]).append(" ");
            }
        }
     return sb.toString().trim();
    }
}