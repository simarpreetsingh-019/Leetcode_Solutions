class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(char i : jewels.toCharArray()){
            for(char j : stones.toCharArray()){
                if(i==j) ans++;
            }
        }
        return ans;
    }
}