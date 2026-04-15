class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c : p.toCharArray()){
            b[c - 'a']++;
        }
        int window = p.length();
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i) - 'a']++;
            if(i >= window){
                a[s.charAt(i - window) - 'a']--;
            }
            if(Arrays.equals(a, b)){
                res.add(i - window + 1);
            }
        }
        return res;
    }
}