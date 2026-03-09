class Solution {
    public static boolean isvowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max = 0;
        int cv = 0;
        for(int i = 0; i < s.length(); i++){
            if(isvowel(s.charAt(i))){
               cv++;
            }
            if(i >= k){
                if(isvowel(s.charAt(i - k))){
                    cv--;
                }
            }
            max = Math.max(max, cv);
        }
        return max;
    }
}