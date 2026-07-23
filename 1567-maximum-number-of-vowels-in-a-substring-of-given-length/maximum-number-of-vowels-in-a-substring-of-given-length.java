class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int c = 0;
        
        for(int right = 0; right < s.length(); right++){
           
            if(isvowel(s.charAt(right))){        
               c++;
            }
            if(right - left + 1 > k){
                if(isvowel(s.charAt(left))){
                    c--;
                }
                left++;
            }
            if(right - left + 1 == k){
                max = Math.max(max, c);
            }
            
        }
        return max;
    }
    public static boolean isvowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}