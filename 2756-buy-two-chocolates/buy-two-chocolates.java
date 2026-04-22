class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int p : prices){
            if(p < min1){
                min2 = min1;
                min1 = p;
            }
            else if(p < min2){
                min2 = p;
            }
        }
        int total = min1 + min2;
        if(total <= money){
            return money - total;
        }
        return money;
    }
}