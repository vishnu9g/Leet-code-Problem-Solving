class Solution {
    public List<List<Integer>> generate(int r) {
       List<List<Integer>> a = new ArrayList<>();
       for(int i=0;i<r;i++){
        List<Integer> b = new ArrayList<>();
        for(int j=0;j<=i;j++){
            int sum=0;
            if(j==0||j==i){
                b.add(1);
            }
            else{
                b.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
            }
        }
         a.add(b);
       } 
       return a;
    }
}