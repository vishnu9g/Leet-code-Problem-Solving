class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       int n = matches.length;
       int[] arr1 = new int[100001];
       int[] arr2 = new int[100001];
       for(int i=0;i<n;i++){
            arr1[matches[i][0]]++;
       }  
        for(int i=0;i<n;i++){
            arr2[matches[i][1]]++;
       }
       List<Integer> a = new ArrayList<>();
       List<Integer> b = new ArrayList<>();
       int n1 = arr1.length;
       int n2 = arr2.length;
       for(int i=0;i<n1;i++){
            if(arr1[i]>=1&&arr2[i]==0){
                a.add(i);
            }
       } 
       for(int i=0;i<n2;i++){
            if(arr2[i]==1){
                b.add(i);
            }
       }
       List<List<Integer>> r = new ArrayList<>();
       r.add(a);
       r.add(b);
       return r;
    }
}