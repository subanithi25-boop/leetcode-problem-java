class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
            set.add(i);
        }
        for(int i = min + 1; i < max; i++){
            if(!set.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}