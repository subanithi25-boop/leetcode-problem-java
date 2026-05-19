class Solution {
    public String replaceDigits(String s) {
        String r = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch - '0';
                char prev = s.charAt(i - 1);
                r += (char)(prev + num);
            }
            else{
                r += ch;
            }
        }
        return r;
    }
}