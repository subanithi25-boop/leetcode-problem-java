class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];  
            while (sum >= target) {
                minlen = Math.min(minlen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}