class Solution {
    public boolean checkValidString(String s) {
        int maxopen = 0;
        int minopen = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                maxopen++;
                minopen++;
            }
            else if(ch == ')'){
                maxopen--;
                minopen--;
            }
            else{
                minopen--;
                maxopen++;
            }
            if(maxopen < 0){
                return false;
            }
           minopen = Math.max(minopen, 0);
        }
        return minopen == 0;
    }
}