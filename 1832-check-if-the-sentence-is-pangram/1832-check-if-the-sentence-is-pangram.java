class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] alphabet = new boolean[26];
    
    for (int i = 0; i < sentence.length(); i++)
    {
		// [char-'a'] will get the index of array from 0 to 25
		// Example: 'a' - 'a' == 0, 'b' - 'a' == 1, 'c' - 'a' == 2 and etc. 
        if (!alphabet[sentence.charAt(i)-'a']) {
            alphabet[sentence.charAt(i)-'a'] = true;
        }
    }
    
    for (boolean character : alphabet) {
        if (!character) {
            return false;
        }
    }
    
    return true;
}
}
