class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int temp = n;
        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        int diff = Math.abs(temp - rev);
        return diff;
    }
}