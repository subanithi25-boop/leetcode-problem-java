class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0; 
        int end = 0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            max = Math.max(max , end - start + 1);
            end++;
        }
        return max;
    }
}