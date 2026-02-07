class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int u = 0;
        boolean b[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(b[i])
            continue;
            int c = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    c++;
                    b[j] = true;
                }
            }
            if(c == 1){
                u = nums[i];
            }
        }
        return u;
    }
}