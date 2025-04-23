class Solution {
    public String reverseWords(String s) {
        int n = s.length();
         String[] arr= s.trim().split("\\s+");
        String r = "";
        for(int i=arr.length-1;i>0;i--){
           r+=arr[i]+" ";
        }
        System.out.print(Arrays.toString(arr));
        return r+arr[0];
    }
}