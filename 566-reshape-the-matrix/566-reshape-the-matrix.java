class Solution {
   public int[][] matrixReshape(int[][] mat, int r, int c) {
		int  m = mat.length, n = mat[0].length, elements = m*n;
		
		if(r*c != elements)
            return mat;
			
        int [][] result = new int[r][c];
        int i = 0, j = 0, a = 0, b = 0, k = 0;

        while(k < elements){
            result[a][b] = mat[i][j];
            j++;
            b++;
            if(j == n){
                j = 0;
                i++;
            }
            if(b == c){
                b = 0;
                a++;
            }
            k++;
        }
        return result;
    }
}