class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            // char[] arr = word.toCharArray(); //* Alternative way
            boolean res = true;
            for(int l=0, r=word.length()-1; l<=r; l++, r--){
                if(word.charAt(l) != word.charAt(r)) res = false;
                // if(arr[l] != arr[r-l]) res = false; //* Alternative way
            }
            if(res) return word;
        }
        return "";
    }
}