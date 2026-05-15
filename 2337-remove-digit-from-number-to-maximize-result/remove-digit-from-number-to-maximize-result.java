class Solution {
    public String removeDigit(String number, char digit) {
        String r = "";
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                String ans = number.substring(0, i) + number.substring(i + 1);
                if(ans.compareTo(r) > 0){
                    r = ans;
                }
            }
        }
        return r;
    }
}