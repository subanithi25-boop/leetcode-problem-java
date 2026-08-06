class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        String r = "";
        int c = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(c == k){
                r = "-" + r;
                c = 0;
            }
            r = s.charAt(i) + r;
            c++;
        }
        return r;
    }
}