class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="", b="";
        for(String i : word1) a += i;
        for(String j : word2) b += j;
        return a.equals(b);
    }
}