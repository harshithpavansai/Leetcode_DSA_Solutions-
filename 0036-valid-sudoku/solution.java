class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board[0].length!=9){
            return false;
        }
        //rowssssssss
        for(int i=0;i<9;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                map.put(board[i][j],map.getOrDefault(board[i][j],0)+1);
            
            if (map.get(board[i][j]) > 1) {
                return false;
            }
                }
            }
        }
        // columnsssssss
        for(int j=0;j<9;j++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'){
                map.put(board[i][j],map.getOrDefault(board[i][j],0)+1);
            
            if (map.get(board[i][j]) > 1) {
                return false;
            }
                }
            }
        }

        //3x3.......
       for(int row=0;row<9;row+=3){
            
            for(int col=0;col<9;col+=3){
                HashMap<Character,Integer> map = new HashMap<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            map.put(board[i][j], map.getOrDefault(board[i][j], 0) + 1);
                            if (map.get(board[i][j]) > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
