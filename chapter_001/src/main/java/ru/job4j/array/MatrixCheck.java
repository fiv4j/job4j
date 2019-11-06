package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        printBoard(board);
        char gameChar = 'X';
        boolean foundWin = false;
        for (int i = 0; !foundWin && i < board.length; i++) {
            int rowsCount = 0;
            int linesCount = 0;
            for (int j = 0; j < board.length; j++) {
                rowsCount += board[i][j] == gameChar ? 1 : 0;
                linesCount += board[j][i] == gameChar ? 1 : 0;
                foundWin = rowsCount == board.length || linesCount == board.length;
            }
        }
        return foundWin;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
