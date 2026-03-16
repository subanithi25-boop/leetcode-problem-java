class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            set.add(word.charAt(i));
        }
        int count = 0;
        for(char c : set){
            char l = Character.toLowerCase(c);
            if(c >= 'A' && c <= 'Z'){
                if(set.contains(l)){
                    count++;
                }
            }
        }
        return count;
    }
}