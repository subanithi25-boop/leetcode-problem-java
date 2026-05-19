class Solution {
    public int countSpecialNumbers(int n) {
        List<Integer> digits = new ArrayList<>();
        int temp = n;
        while(temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        int len = digits.size();
        int ans = 0;
        for(int i = 1; i < len; i++) {
            int count = 9;
            int available = 9;
            for(int j = 1; j < i; j++) {
                count *= available;
                available--;
            }
            ans += count;
        }
        boolean[] used = new boolean[10];
        for(int i = len - 1; i >= 0; i--) {
            int digit = digits.get(i);
            for(int j = (i == len - 1 ? 1 : 0); j < digit; j++) {
                if(!used[j]) {
                    int count = 1;
                    int available = 10 - (len - i);
                    for(int k = 0; k < i; k++) {
                        count *= (available - k);
                    }
                    ans += count;
                }
            }
            if(used[digit]) {
                return ans;
            }
            used[digit] = true;
        }
        return ans + 1;
    }
}