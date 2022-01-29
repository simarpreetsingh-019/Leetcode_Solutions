class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for(int i = 0; i< mat.length; i++)
        {        
            if (i != mat.length - 1 - i) {
                // Sum first and last diagonal elements
                result += mat[i][i] + mat[i][mat.length-1-i];
            } else {
            result += mat[i][i];
        }
    }
    
    return result;
    }
}    