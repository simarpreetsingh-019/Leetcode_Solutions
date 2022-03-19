class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s: sentences) {
            // int a = s.split(" ").length;
            // max = max > a ? max : a;
            max = Math.max(max, s.split(" ").length); // Alternative of above 2 lines
        }
        return max;
    }
}