class Solution {
    public int maximumLengthSubstring(String s) {
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while(map.get(s.charAt(right)) > 2){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}