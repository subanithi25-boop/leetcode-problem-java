class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int c = 0;
        int pro = 1;
        for(int end = 0; end < n; end++){
            pro *= nums[end];
        
            while(start <= end && pro >= k){
               pro /= nums[start];
               start++;
            }
            c += end - start + 1;
        }
        return c;
    }
}