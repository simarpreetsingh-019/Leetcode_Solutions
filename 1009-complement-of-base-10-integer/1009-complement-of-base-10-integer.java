class Solution {
    public int bitwiseComplement(int N) {
        int X = 1;
        while (N > X) X = X * 2 + 1; // X = (X << 1) + 1;
        return N ^ X; // X - N;
    }
}