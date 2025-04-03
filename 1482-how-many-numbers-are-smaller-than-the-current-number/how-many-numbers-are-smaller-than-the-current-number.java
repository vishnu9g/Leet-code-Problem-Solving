class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int c = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c=0;
                     if(j!=i&&nums[j]<nums[i])
                     {
                             c++;
                            arr[i]+=c;
                     }
            }
        }
        return arr;
    }
}