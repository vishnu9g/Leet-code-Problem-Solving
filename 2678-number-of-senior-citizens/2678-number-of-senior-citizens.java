class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(int i=0;i<details.length;i++){
            String k = details[i];
            String temp = "";
            for(int j=0;j<k.length();j++){
                if(k.charAt(j)=='M'||k.charAt(j)=='F'||k.charAt(j)=='O'){
                    temp+=k.charAt(j+1);
                    temp+=k.charAt(j+2);
                    break;
                }
            }
            if(Integer.parseInt(temp)>60) c++;
        }
        return c;
    }
}