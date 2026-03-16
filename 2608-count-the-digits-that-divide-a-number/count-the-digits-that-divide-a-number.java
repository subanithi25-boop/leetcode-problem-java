class Solution {
    public int countDigits(int num) {
        int temp = num;
        int c = 0;
        while(num > 0){
            int d = num % 10;
            if(temp % d == 0){
                c++;
            }
            num /= 10;
        }
        return c;
    }
}