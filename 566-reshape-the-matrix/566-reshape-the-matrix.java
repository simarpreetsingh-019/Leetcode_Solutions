class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        
        if(row*column != r*c)
            return nums;
        
        int[][] output_arr = new int[r][c];
        int row_no = 0;
        int column_no = 0;
        
        for(int i = 0; i< row;i++)
        {
            for(int j = 0; j< column; j++)
            {
                output_arr[row_no][column_no] = nums[i][j];
                column_no++;
                if(column_no == c)
                {
                    column_no = 0;
                    row_no+=1;
                }
            }
        }
        return output_arr;
    }
}