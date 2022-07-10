class Solution {
    public int reachNumber(int target) {
        int moves=0, sum=0;
        target=Math.abs(target);
        while(sum<target || (sum-target)%2 != 0) {
            moves++;
            sum+=moves;
        }
        return moves;
    }
}