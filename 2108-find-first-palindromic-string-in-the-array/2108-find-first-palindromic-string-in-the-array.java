class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder new1 = new StringBuilder(words[i]);
            String s = new1.reverse().toString();
            if(words[i].equals(s)){
                return words[i];
            }
        }
        return "";
        
    }
}