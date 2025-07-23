class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int l = 0;
        boolean o = false;
        for(int i=0;i<128;i++) {
            if(arr[i]%2==0) {
                l+=arr[i];
            } else {
                l+=arr[i]-1;
                o=true;
            }
        }
        if(o) 
            l+=1;

        return l;
    }
}
