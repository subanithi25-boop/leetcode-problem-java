class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        boolean[] vis = new boolean[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(vis[ch - 'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > i){
                vis[st.pop() - 'a'] = false;
            }
            st.push(ch);
            vis[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}