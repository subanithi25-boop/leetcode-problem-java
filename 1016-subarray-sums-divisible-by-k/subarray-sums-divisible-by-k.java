class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int r = sum % k;
            if(r < 0)
            r += k;
            c += map.getOrDefault(r, 0);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        return c;
    }
}