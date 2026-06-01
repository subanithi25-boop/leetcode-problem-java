class Solution {
    public String getEncryptedString(String s, int k) {
        String r = "";
        for(int i = 0; i < s.length(); i++){
            int idx = (i + k) % s.length();
            r += s.charAt(idx);
        }
        return r;
    }
}