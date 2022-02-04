class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean rotate0 = true, rotate90 = true, rotate180 = true, rotate270 = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 0
                if (mat[i][j] != target[i][j]) {
                    rotate0 = false;
                }
                // 90
                if (mat[i][j] != target[n - 1 - j][i]) {
                    rotate90 = false;
                }
                // 180
                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) {
                    rotate180 = false;
                }
                // 270
                if (mat[i][j] != target[j][n - 1 - i]) {
                    rotate270 = false;
                }
                
                if (!rotate0 && !rotate90 && !rotate180 && !rotate270) {
                    return false;
                }
            }
        }
        
        return true;
    }
}