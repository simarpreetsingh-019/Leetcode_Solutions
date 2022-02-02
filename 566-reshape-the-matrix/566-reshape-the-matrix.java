class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m!=r*c){
            return mat;
        }
        int[][] newmatrix=new int[r][c];
        int sr=0;
        int sc=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            newmatrix[sr][sc]=mat[i][j];
                 sc++;
                if(sc==c){
                    sr++;
                    sc=0;
                }           
            }
        }
        return newmatrix;
    }
}