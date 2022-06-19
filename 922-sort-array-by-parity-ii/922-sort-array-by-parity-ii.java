class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int enev_idx = 0, odd_idx = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[enev_idx] = A[i];
                enev_idx += 2;
            } 
            else {
                res[odd_idx] = A[i];
                odd_idx += 2;
            }
        }
        return res;
    }
}
