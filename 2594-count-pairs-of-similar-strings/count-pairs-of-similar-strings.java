class Solution {
    public int similarPairs(String[] words) {
        int c = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                Set<Character> s1 = new HashSet<>();
                Set<Character> s2 = new HashSet<>();
                for(char ch : words[i].toCharArray())
                    s1.add(ch);
                for(char ch : words[j].toCharArray())
                    s2.add(ch);
                if(s1.equals(s2)){
                    c++;
                }
            }
        }
        return c;
    }
}