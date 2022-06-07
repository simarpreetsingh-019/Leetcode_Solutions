class NumMatrix {

int n;
int m;
int prefix [][];
public NumMatrix(int[][] matrix) {
    n = matrix.length;
    m = matrix[0].length;
    
    prefix = new int[n][m];
    
    for(int i=0;i<n;i++)
    {
        prefix[i][0] = matrix[i][0];
        for(int j=1;j<m;j++)
        {
            prefix[i][j] = matrix[i][j] + prefix[i][j-1];  // Store the prefix sum with the combination
        }
    }
}

public int sumRegion(int row1, int col1, int row2, int col2) {
    int res = 0;
    
    // int row3 = row1;
    // int col3 = col2;
    // int row4 = row2;
    // int col4 = col1;
    
    int sum = 0;
    
    for(int i = row1 ; i <= row2 ; i ++)
    {
        if(col1 - 1 >= 0)
            sum += prefix[i][col2] - prefix[i][col1 - 1];
        else
            sum += prefix[i][col2];
    }
    
    return sum;
    
}
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */