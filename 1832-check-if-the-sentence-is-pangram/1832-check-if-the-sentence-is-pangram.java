class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] ans;
        ans = sentence.toCharArray();
        for (char i = 'a'; i <='z' ; i++) {
                if(!(check(i,ans))){
                    return false;
                }
        }
        return true;
    }
    
    public boolean check(char a,char [] q){
        for (char j : q) {
            if (a == j) {
                return true;
            }
        }
        return false;
    }
}