class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c : s1.toCharArray()){
            a[c - 'a']++;
        }
        int window = s1.length();
        for(int i = 0; i < s2.length(); i++){
            b[s2.charAt(i) - 'a']++;
            if(i >= window){
                b[s2.charAt(i - window) - 'a']--;
            }
            if(Arrays.equals(a, b)){
                return true;
            }
        }
        return false;
    }
}