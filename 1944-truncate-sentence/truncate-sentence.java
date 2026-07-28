class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] w = s.split(" ");
        for(int i = 0; i < w.length; i++){
            if(i < k){
                sb.append(w[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}