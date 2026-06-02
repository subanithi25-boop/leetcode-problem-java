class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
         int s = 0;
        for(int num : nums){
            while(num > 0){
                s += num % 10;
                num /= 10;
            }
        }
        int ans = Math.abs(sum - s);
        return ans;
    }
}