class Solution {
    public int twoEggDrop(int n) {
        int cnt = 1;
        int pre = 1;
        while(cnt < n) {
            pre++;
            cnt += pre;
        }
        return pre;
    }
}