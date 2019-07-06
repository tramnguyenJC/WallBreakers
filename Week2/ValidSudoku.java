import java.util.*;
class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> colCharsList = new ArrayList<>();
        HashMap<String, HashSet<Character>> rowColStrToCharSet = new HashMap<>();
        for(int row = 0; row < board.length; row++) {
            HashSet<Character> rowChars = new HashSet<>();
            for (int col = 0; col < board[0].length; col++) {
                char c = board[row][col];
                String rowColStr = (row/3) + "" + (col/3);
                if(rowColStrToCharSet.containsKey(rowColStr)) {
                    if (rowColStrToCharSet.get(rowColStr).contains(c)) {
                        System.out.println(1);
                        return false;
                    }
                    rowColStrToCharSet.get(rowColStr).add(c);
                } else {
                    HashSet<Character> newSet = new HashSet<>();
                    newSet.add(c);
                    rowColStrToCharSet.put(rowColStr, newSet);
                }
                if (row == 0) {
                    HashSet<Character> colChars = new HashSet<>();
                    colCharsList.add(colChars);
                }
                if (colCharsList.get(col).contains(c)) {
                    System.out.println(2);
                    return false;
                }
                if (rowChars.contains(c)) {
                    System.out.println(3 + c);
                    return false;
                }
                rowChars.add(c);
                colCharsList.get(col).add(c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}