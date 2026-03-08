class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] f = new int[n + 1];
        int[] res = new int[2];
        for(int i = 0; i < n; i++){
            f[nums[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(f[i] > 1){
                res[0] = i;
            }
            if(f[i] == 0){
                res[1] = i;
            }
        }
        return res;
    }
}