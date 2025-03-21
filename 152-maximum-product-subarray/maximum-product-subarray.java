class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (nums == null || nums.length == 0) {
            System.out.println("0");
            return 0;
        }
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                 int temp = maxProduct;
                 maxProduct = minProduct;
                 minProduct = temp;
            }


            if (nums[i] > nums[i] * maxProduct) {
                maxProduct = nums[i];
            } 
            else {
                maxProduct = nums[i] * maxProduct;
            }


            if (nums[i] < nums[i] * minProduct) {
                minProduct = nums[i];
            } else{
                minProduct = nums[i] * minProduct;
            }


            if (maxProduct > result) {
                result = maxProduct;
            }
        }
        return result;
    }
}
