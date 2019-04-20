package Lesson9;

import java.util.Arrays;

public class Task79WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E',}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println();
    }

    /*
    board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
     */
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (exist2(board, word, i, j)) return true;
                }
            }
        }
        return false;
    }

    public static boolean exist2(char[][] board, String word, int i, int j) {
        int[][] visitors = new int[board.length][board[0].length];
        System.out.println(Arrays.deepToString(visitors));
        visitors[i][j] = 1;
        for (int k = 1; k < word.length(); k++) {
            boolean move = true;
            while (move) {

            }
        }
        return false;
    }

    public static boolean havePlaceForMove(int[][] visitors, int i, int j) {
        boolean move = true;
        if (i + 1 > visitors.length || visitors[i + 1][j] != 0) move = false;

        if (i - 1 < 0 || visitors[i + 1][j] != 0) move = false;
     return false;
    }

}
