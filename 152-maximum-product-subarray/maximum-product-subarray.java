class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        int c1, c2;
        for(int i = 1; i < nums.length; i++){
            c1 = min * nums[i];
            c2 = max * nums[i];
            min = Math.min(nums[i], Math.min(c1, c2));
            max = Math.max(nums[i], Math.max(c1, c2));
            res = Math.max(res, max);
        }
        return res;
    }
}