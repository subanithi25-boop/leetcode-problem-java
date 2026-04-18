class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> c = new HashMap<>();
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> l = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            c.put(num, c.getOrDefault(num, 0) + 1);
            if(!f.containsKey(num)){
                f.put(num, i);
            }
            l.put(num, i);
        }
        int d = 0;
        for(int i : c.values()){
            d = Math.max(d, i);
        }
        int min = n;
        for(int num : c.keySet()){
            if(c.get(num) == d){
                int len = l.get(num) - f.get(num) + 1;
                min = Math.min(min, len);
            }
        }
        return min;
    }
}