class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long c = 0;
        int[] freq = new int[24];
        for(int i = 0; i < hours.length; i++){
            int rem = hours[i] % 24;
            int need = (24 - rem) % 24;
            c += freq[need];
            freq[rem]++;
        }
        return c;
    }
}