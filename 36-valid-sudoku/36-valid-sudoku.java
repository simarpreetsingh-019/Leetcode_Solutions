//Method 2
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row ++)  {
            for(int col = 0; col < 9; col ++) {
                if(board[row][col] != '.') {     // we'll check
                    char temp = board[row][col];
                    board[row][col] = '.';
                    if(!isSafe(board, row, col, temp)) {
                        return false;
                    }
                    board[row][col] = temp;
                }
            }
        }
        return true;
    }
    
    
    static boolean isSafe(char[][] board, int row, int col, char value) {
        // Checking Col
        for(int i = 0; i < 9; i ++) {
            if(board[i][col] == value) {
                return false;
            }
        }
        // Checking Row
        for(int i = 0; i < 9; i ++) {
            if(board[row][i] == value) {
                return false;
            }
        }
        // Checking in sub grid
        int rowStart = row - row % 3;
        int colStart = col - col % 3;
        for(int i = rowStart; i < rowStart + 3; i ++) {
            for(int j = colStart; j < colStart + 3; j ++) {
                if(board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }
}
// Method 1
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         int size = board.length;
//         Set<Character> rowSet, colSet;
//         //check for rows and cols
//         for(int i=0;i<size;i++){
//             rowSet = new HashSet<>();
//             colSet = new HashSet<>();
//             for(int j=0;j<size;j++){
//                 if(board[i][j] != '.' && rowSet.contains(board[i][j])) return false;
//                 if(board[j][i] != '.' && colSet.contains(board[j][i])) return false;
//                 rowSet.add(board[i][j]);
//                 colSet.add(board[j][i]);
//             }    
                
//         }
//         // Check for each block.
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(!validateEachBlock(board, i,j)) return false;
//             }
//         }
        
//         return true;
//     }
//     public boolean validateEachBlock(char[][] board, int row, int col){
//         Set<Character> blockSet = new HashSet<>();
//         for(int i=row*3;i<row*3+3;i++){
//             for(int j=col*3;j<col*3+3;j++){
//                 if(board[i][j] != '.' && blockSet.contains(board[i][j])) return false;
//                 blockSet.add(board[i][j]);
//             }
//         }
//        return true;            
//     }
// 	}