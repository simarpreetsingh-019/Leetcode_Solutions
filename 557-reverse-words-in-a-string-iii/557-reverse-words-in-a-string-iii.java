class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        for (int i = 0, j = 1; j <= n; j++) {
            if (j == n || c[j] == ' ') {
                reverse(c, i, j-1);
                i = j+1;
            }
        }
        return new String(c);
    }

    private void reverse(char[] c, int L, int R) {
        while (L < R) {
            char temp = c[L];
            c[L] = c[R];
            c[R] = temp;
            L++; R--;
        }
    }
}