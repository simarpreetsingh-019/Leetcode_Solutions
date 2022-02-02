class Solution {
   public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[r][c];
        if(r*c != row*col) {
            return mat;
        } else {  
            int colp = 0;
            int rowp = 0;
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    ans[rowp][colp] = mat[i][j];
                    colp++;
                    if(colp == c) {
                        colp = 0;
                        rowp++;
                    }
                }
            }
        }
        return ans;
    }
}