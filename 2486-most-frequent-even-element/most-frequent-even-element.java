class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int ans = -1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getKey() % 2 == 0){
                if(e.getValue() > max){
                    max = e.getValue();
                    ans = e.getKey();
                }
                else if(e.getValue() == max && e.getKey() < ans){
                    ans = e.getKey();
                }
            }
        }
        return ans;
    }
}