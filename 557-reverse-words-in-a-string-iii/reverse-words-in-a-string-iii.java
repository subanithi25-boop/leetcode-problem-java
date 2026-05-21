class Solution {
    public String reverseWords(String s) {
        String w[] = s.split(" ");
        String r = "";
        for (int i = 0; i < w.length; i++) {
            String word = w[i];
            String res = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                res += word.charAt(j);
            }
            r = r + res;
            if (i < w.length - 1) {
                r += " ";
            }
        }
        return r;
    }
}