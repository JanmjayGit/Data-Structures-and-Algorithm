class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Boolean>[][] box = new HashMap[9][9];
        HashMap<Character, Boolean>[] col = new HashMap[9];
        HashMap<Character, Boolean>[] row = new HashMap[9];

        //initialize hashmap
        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<>(); 
            col[i] = new HashMap<>();
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                box[i][j] = new HashMap<>();
            }
        }

        for(int i =0; i< 9; i++){
            for(int j =0; j< 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                char x = board[i][j];
                if(box[i/3][j/3].containsKey(x)){
                    return false;
                }
                box[i/3][j/3].put(x,true);

                if(col[j].containsKey(x)){
                    return false;
                }
                col[j].put(x, true);

                if(row[i].containsKey(x)){
                    return false;
                }
                row[i].put(x,true);
            }
        }
        return true;
    }
}