class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
        return s;
        String ls = "";
        for(int i = 0; i < s.length(); i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            String p = s.substring(l + 1, r);
            if(p.length() > ls.length()){
                ls = p;
            }
            l = i - 1;
            r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            p = s.substring(l + 1, r);
            if(p.length() > ls.length()){
                ls = p;
            }
        }
        return ls;
    }
}