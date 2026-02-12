public class Solution {
    public int SumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        int n = nums.Length;
        Array.Sort(nums);
        int[] fre = new int[101];
        for(int i=0;i<n;i++){
            fre[nums[i]]++;
        }
        for(int i=0;i<=nums[n-1];i++){
            if(fre[i]%k==0){
                sum+=i*fre[i];
            }
        }
        return sum;
    }
}