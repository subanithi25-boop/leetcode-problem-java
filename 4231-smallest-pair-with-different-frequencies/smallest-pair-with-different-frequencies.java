class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        for(int i = 1; i <= 100; i++){
            if(freq[i] == 0){
                continue;
            }
            for(int j = i + 1; j <= 100; j++){
                if(freq[j] == 0){
                    continue;
                }
                if(freq[i] != freq[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}