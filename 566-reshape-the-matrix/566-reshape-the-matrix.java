class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if((mat.length==r && mat[0].length==c) ||(mat.length*mat[0].length!=r*c)){
            return mat;
        }
        
        //Transform function
        int[][] matX=new int[r][c];
        int x=0;//row 
        int y=0;//col
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                matX[x][y]=mat[i][j];
                if(y==c-1){
                    y=-1;
                    x++;
                }
                y++; 
            }
        }
        
        return matX;
    }
}