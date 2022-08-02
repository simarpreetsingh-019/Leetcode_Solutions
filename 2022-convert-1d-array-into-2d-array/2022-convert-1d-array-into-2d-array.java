class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans=new int[m][n];
        int k=0;
        int[][] arr=new int[0][0];
        if(original.length!=(m*n)) return arr;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                ans[i][j]=original[k++];
            }
        }
        return ans;
    }
}