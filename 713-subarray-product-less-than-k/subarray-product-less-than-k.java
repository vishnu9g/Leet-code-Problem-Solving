class Solution
{
    public int numSubarrayProductLessThanK(int[] nums, int k)
    {
        int c = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int p = 1;
            for (int f = i; f < nums.length; f++)
            {
                p *= nums[f];
                if (p < k)
                    c++;
                else
                    break; 
            }
        }
        return c;
    }
}
