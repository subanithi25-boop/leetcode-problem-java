class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());
        l.sort((a, b) -> b.getValue() - a.getValue());
        int[] a = new int[k];
        
        for(int i = 0; i < k; i++){
            a[i] = l.get(i).getKey();
           
        }
        return a;
    }
}