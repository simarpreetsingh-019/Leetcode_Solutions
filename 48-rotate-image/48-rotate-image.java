class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newArr = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0;  j< matrix[0].length; j++){
                int newRow = j+n % n;
                // 0 + 3 mod 3 = 0
                // 1 + 3 mod 3 = 1;
                // 2 + 3 mod 3 = 2;
                
                int newCol = (n-1)-i;
                // row 0 -> col 2 (n-1)
                // row 1 -> col 1 (n-2)
                // row 2 -> col 0 (n-3)
                newArr[newRow][newCol] = matrix[i][j];
        }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0;  j< matrix[0].length; j++){
            matrix[i][j] = newArr[i][j];
            
            }}
        
    }
}