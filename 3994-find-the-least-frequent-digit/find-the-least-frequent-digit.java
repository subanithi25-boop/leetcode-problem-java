class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        int c = 0;
        while(n > 0){
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            if(freq[i] > 0 && freq[i] < min){
                min = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}