class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int n : nums){
            sum += n;
            set.add(n);
        }
        int ans = Math.max(1, sum / nums.length + 1);
        for(int i = 0; i < nums.length; i++){
            if(set.contains(ans)){
               ans++;   
            }
        }
        return ans;
    }
}