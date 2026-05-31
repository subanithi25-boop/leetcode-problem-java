class Solution {
    public String reformat(String s) {

        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch))
                digits.add(ch);
            else
                letters.add(ch);
        }

        if (Math.abs(letters.size() - digits.size()) > 1)
            return "";

        StringBuilder ans = new StringBuilder();

        boolean letterFirst = letters.size() >= digits.size();

        int i = 0, j = 0;

        while (i < letters.size() || j < digits.size()) {

            if (letterFirst && i < letters.size())
                ans.append(letters.get(i++));

            if (j < digits.size())
                ans.append(digits.get(j++));

            if (!letterFirst && i < letters.size())
                ans.append(letters.get(i++));
        }

        return ans.toString();
    }
}