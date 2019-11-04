package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        printBoard(board);
        return isLineWin(board) || isRowWin(board);
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
    private static boolean isLineWin(char[][] board) {
        char winChar = 'X';
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length - 1; cell++) {
                if (board[row][cell] != winChar || board[row][cell] != board[row][cell + 1]) {
                    break;
                }
                if (cell == board.length - 2) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isRowWin(char[][] board) {
        char winChar = 'X';
        for (int cell = 0; cell < board.length; cell++) {
            for (int row = 0; row < board.length - 1; row++) {
                if (board[row][cell] != winChar || board[row][cell] != board[row + 1][cell]) {
                    break;
                }
                if (row == board.length - 2) {
                    return true;
                }
            }
        }
        return false;
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
