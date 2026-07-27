class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int temp = n;
        while(n != 0){
            int d = n % 10;
            int fact = 1;
            for(int i = 1; i <= d; i++){
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        int[]  freq = new int[10];
        while(temp > 0){
            freq[temp % 10]++;
            temp /= 10;
        }
        while(sum > 0){
            freq[sum % 10]--;
            sum /= 10;
        }
        for(int i = 0; i < 10; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}