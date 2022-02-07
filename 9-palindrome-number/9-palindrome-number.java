class Solution {
    public boolean isPalindrome(int x) {
        String word = Integer.toString(x);
        int end = word.length()-1;
        for(int i = 0; i < (word.length()+1)/2; i++){
            if(word.charAt(i) != word.charAt(end-i)){
                 return false;
             }
        }
        return true;
    }
}