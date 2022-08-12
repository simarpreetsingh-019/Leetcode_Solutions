class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int L = 0, R = c.length - 1;
        while(L < R) {
            if (!Character.isLetterOrDigit(c[L])) L++;
            else if (!Character.isLetterOrDigit(c[R])) R--;
            else if (Character.toLowerCase(c[L++]) != Character.toLowerCase(c[R--])) 
                return false;
        }
        return true;
    }
}