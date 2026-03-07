class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        String r = "";
        for(int i=0;i<arr.length;i++){
            int k = Integer.parseInt(arr[i]);
            String b = Integer.toBinaryString(k);
            if(i!=arr.length-1){
                r+=b+"-";
            }
            else{
                r+=b;
            }
        }
        return r;
    }
}