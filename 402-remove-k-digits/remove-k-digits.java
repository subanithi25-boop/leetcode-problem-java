class Solution {
    public String removeKdigits(String s, int k) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            while(!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }
        
        while(k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : st) {
            sb.append(c);
        }

        while(sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}