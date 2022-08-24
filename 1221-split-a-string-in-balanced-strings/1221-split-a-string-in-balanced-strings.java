class Solution {
    public int balancedStringSplit(String s) {
        int L=0, R=0, ans=0;
        for(char c : s.toCharArray()){
            if(c=='R') R++;
            else L++;
            
            if(L==R) ans++;
        }
        return ans;
    }
}