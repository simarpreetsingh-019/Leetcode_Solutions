class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; ++i){
            String word = words[i];
            boolean isPalindrome = true;
            for (int j = 0; j < word.length() / 2 && isPalindrome; ++j){
                if (word.charAt(j) != word.charAt(word.length() - 1 - j)) isPalindrome = false;
            }
            if (isPalindrome) return word;
        }
        return "";
    }
}