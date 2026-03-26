class Solution {
    public List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        gen(0, 0, "", n);
        return res;
    }
    public void gen(int open, int close, String s, int n){
        if(s.length() == n * 2){
            res.add(s);
            return;
        } 
        if(open < n){
            gen(open + 1, close, s + "(" , n);
        }
        if(close < open){
            gen(open, close + 1, s + ")" , n);
        }
    }
}