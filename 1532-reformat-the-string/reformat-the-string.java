class Solution {
    public String reformat(String s) {
        if(s.length() == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> letter = new Stack<>();
        Stack<Character> digit = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.push(ch);
            }
            else{
                digit.push(ch);
            }
        }
        if(Math.abs(digit.size() - letter.size()) > 1){
            return "";
        }
        while(!letter.isEmpty() && !digit.isEmpty()){
            sb.append(letter.pop()).append(digit.pop());
        }
        if(!letter.isEmpty()){
            sb.append(letter.pop());
        }
        if(!digit.isEmpty()){
            sb.insert(0, digit.pop());
        }
        return sb.toString();
    }
}