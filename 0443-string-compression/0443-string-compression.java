class Solution {
    public int compress(char[] chars) {  
        int i = 0;
        int ind = 0;    
        while(i < chars.length)
        {          
            char cur= chars[i];
            int c= 0;
            while(i<chars.length && chars[i]==cur)
            {
                c++;
                i++;
            }     
            chars[ind++] =cur;    
            if(c>1){
                String num = c + "";
                for(int k=0;k<num.length();k++){
                    chars[ind++]=num.charAt(k);
                }
            }
        }      
        return ind;
    }
}