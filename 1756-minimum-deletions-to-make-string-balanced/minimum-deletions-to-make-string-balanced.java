class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int deletion = 0;
        for(char c : s.toCharArray()){
            if(c == 'b'){
                countB++;
            }
            else{
                deletion = Math.min(deletion + 1, countB);
            }
        }
        return deletion;
    }
}