class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[n - 1];
        int b = nums[n - 2];
        return  (a - 1) * (b - 1);
    }
}