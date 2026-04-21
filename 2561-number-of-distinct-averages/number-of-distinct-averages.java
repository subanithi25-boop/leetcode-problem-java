class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;
        Set<Double> set = new HashSet<>();
        while(left < right){
            double avg = (nums[left] + nums[right]) / 2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}