class Solution {
    public static int findGcd(int a, int b){
        if(b == 0){
            return a;
        }
        return findGcd(b, a % b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int g = numsDivide[0];
        for(int i = 0; i < numsDivide.length; i++){
            g = findGcd(g, numsDivide[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(g % nums[i] == 0){
                return i;
            }
        }
        return -1;
    }
}