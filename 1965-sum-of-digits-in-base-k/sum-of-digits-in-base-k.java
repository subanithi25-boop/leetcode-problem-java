class Solution {
    public int sumBase(int n, int k) {
        int sum  = 0;
        while(n > 0){
            int t = n % k;
            sum += t;
            n /= k;
        }
        return sum;
    }
}