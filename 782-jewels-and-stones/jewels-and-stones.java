class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int[] freq = new int[128];
       for(char ch : jewels.toCharArray()){
          freq[ch]++;
       }
       int c = 0;
       for(int i = 0; i < stones.length(); i++){
           if(freq[stones.charAt(i)] > 0){
            c++;
           }
           
       }
       return c;
    }
}