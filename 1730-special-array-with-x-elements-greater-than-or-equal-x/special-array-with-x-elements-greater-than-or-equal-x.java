class Solution {
    public int specialArray(int[] nums) {
       for(int i = 0; i <= nums.length; i++){
          int c = 0;
          for(int n : nums){
            if(n >= i){
                c++;
            }
          }
          if(c == i){
            return i;
          }
       }
       return -1;
    }
}