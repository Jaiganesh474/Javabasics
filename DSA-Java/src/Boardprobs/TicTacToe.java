package Boardprobs;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char player = 'X';

        for (int turn = 0; turn < 9; turn++) {

            printBoard();

            System.out.println("Player " + player + " enter row and column: 0-2 only");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (board[r][c] == ' ') {
                board[r][c] = player;
            } else {
                System.out.println("Cell already filled! Try again.");
                turn--;
                continue;
            }

            if (checkWin(player)) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        printBoard();
        System.out.println("Game Draw!");
    }
}
